package ch.axa.Datenpersistenz.repository;

import ch.axa.Datenpersistenz.model.Joke;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface JokeRepository extends CrudRepository<Joke, Integer> {

    public Optional<Joke> findJokeByRating(int rating);
}
