package io.hbsmith;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String displayIndex() {
        return "index";
    }

    @RequestMapping(value = {"/master"}, method = RequestMethod.GET)
    public String displayMaster() {
        // TOOD: Implement here
        return "index";
    }

    @Transactional(readOnly = true)
    @RequestMapping(value = {"/replica"}, method = RequestMethod.GET)
    public String displayReplica() {
        try {
            DbContextHolder.setDbType(DbType.REPLICA);
            // TOOD: Implement here
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            DbContextHolder.clearDbType();
        }
        return "index";
    }
}
