package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: apwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apwm implements svb {

    /* renamed from: a */
    static final apwm f85018a = new apwm();

    private apwm() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final sva mo23820a(ViewGroup viewGroup, int i) {
        return new apwl(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false), viewGroup.getContext());
    }
}
