package p000;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: buht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buht {

    /* renamed from: a */
    public final ArrayList f153889a = new ArrayList();

    /* renamed from: b */
    public final buhs f153890b;

    /* renamed from: c */
    public int f153891c;

    /* renamed from: d */
    public int f153892d;

    public buht(buhs buhs) {
        if (buhs.mo72690a()) {
            this.f153890b = buhs;
            this.f153891c = -1;
            return;
        }
        throw new IllegalArgumentException("First fragment is required for construction.");
    }

    public final String toString() {
        return String.format(Locale.US, "Fragment{%s}, lastFragmentReceived=%d, currentTransferLength=%d", this.f153890b, Integer.valueOf(this.f153891c), Integer.valueOf(this.f153892d));
    }
}
