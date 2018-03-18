package com.apps.adrcotfas.goodtime.BL;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

public class EventBus {

    public EventBus() {
    }

    private PublishSubject<Object> subject = PublishSubject.create();

    /**
     * Pass any event down to event listeners.
     */
    public void send(Object o) {
        subject.onNext(o);
    }

    /**
     * Subscribe to this Observable. On event, do something
     */
    public Observable<Object> getEvents() {
        return subject;
    }
}
