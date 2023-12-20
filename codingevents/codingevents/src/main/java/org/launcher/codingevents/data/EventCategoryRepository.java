package org.launcher.codingevents.data;

import org.launcher.codingevents.models.Event;
import org.launcher.codingevents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;

public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {
}
