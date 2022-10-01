package co.develhope.UploaderDownloader.repository;

import co.develhope.UploaderDownloader.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
