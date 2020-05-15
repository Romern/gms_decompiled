package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: actv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class actv implements svb {

    /* renamed from: a */
    static final actv f60768a = new actv();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final sva mo23820a(ViewGroup viewGroup, int i) {
        return new actu(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
