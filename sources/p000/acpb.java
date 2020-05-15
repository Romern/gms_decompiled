package p000;

import android.content.ContentResolver;

/* renamed from: acpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acpb implements Iterable {

    /* renamed from: a */
    public static final String[] f60399a = {"event_id", "title", "description", "eventLocation", "begin", "end", "allDay"};

    /* renamed from: b */
    public static final String[] f60400b = {"event_id", "attendeeName", "attendeeEmail", "attendeeType", "attendeeStatus"};

    /* renamed from: c */
    private final ContentResolver f60401c;

    /* renamed from: d */
    private final long f60402d;

    public acpb(ContentResolver contentResolver, long j) {
        this.f60401c = contentResolver;
        this.f60402d = j;
    }

    /* renamed from: a */
    public final acpa iterator() {
        return new acpa(this.f60401c, this.f60402d);
    }
}
