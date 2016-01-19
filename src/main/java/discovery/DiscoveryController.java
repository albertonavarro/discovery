package discovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


@RestController
public class DiscoveryController {

        @Autowired
        ArrayList<Discover> concurrentList;

        @RequestMapping(path = "/discover/", method = RequestMethod.GET)
        public ResponseEntity<ArrayList<Discover>> listAll() {

            return new ResponseEntity<ArrayList<Discover>>(concurrentList, HttpStatus.OK);
        }

       /* @RequestMapping(path = "/discover/{key}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<String> discoverer(@PathVariable String key) {

            for (String keyValue : concurrentHashMap.keySet()){
                if (concurrentHashMap.get(key) == null) {
                    return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
                }
                return new ResponseEntity<String>(concurrentHashMap.get(key),HttpStatus.OK);
            }

            return new ResponseEntity<String>(concurrentHashMap.get(key),HttpStatus.OK);
        }

        @RequestMapping(value = "/discover/", method = RequestMethod.POST)
        public ResponseEntity<Void> createUser(@RequestBody ConcurrentHashMap<String,String> concurrentHashMap,    UriComponentsBuilder ucBuilder) {


                return new ResponseEntity<Void>(HttpStatus.OK);


        }*/


}

