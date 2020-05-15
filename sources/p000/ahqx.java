package p000;

import java.util.Locale;

/* renamed from: ahqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahqx {

    /* renamed from: a */
    public final String f67844a;

    /* renamed from: b */
    public ahqw f67845b = ahqw.AVAILABLE;

    /* renamed from: c */
    public long f67846c = 0;

    public ahqx(String str) {
        this.f67844a = str;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "EndpointInfo{ id = %s, status = %s, offset = %d }", this.f67844a, this.f67845b, Long.valueOf(this.f67846c));
    }
}
