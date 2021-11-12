package net.therap.iajspringjokeapp.service;

import org.springframework.stereotype.Service;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
@Service
public class JokeServiceImpl implements JokeService {

    @Override
    public String getJoke() {
        return "Ita kita nam re vai!!!";
    }
}
