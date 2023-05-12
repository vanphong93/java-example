package model;

import universitymanagement.UException;
import universitymanagement.Util;

/**
 * Learned.
 *
 * @author hasu
 */
public class Learned {
    
    private Subject subject;
    private Float score;
    
    public Learned() {
    }
    
    public Learned(Subject subject, Float score) throws UException {
        this.setSubject(subject);
        this.setScore(score);
    }
    
    public Subject getSubject() {
        return subject;
    }
    
    public final void setSubject(Subject subject) throws UException {
        if (subject == null) {
            throw new UException("subject is null");
        }
        this.subject = subject;
    }
    
    public Float getScore() {
        return score;
    }
    
    public final void setScore(Float  score) throws UException {
        if (score != null && (score < Util.MIN_SCORE || Util.MAX_SCORE < score)) {
            throw new UException("invalid score");
        }
        this.score = score;
    }
    
    
    public void update() {
        
    }
}
