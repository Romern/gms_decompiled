package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: ete */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ete {

    /* renamed from: a */
    public final Object f15668a;

    /* renamed from: b */
    public final LinearLayout f15669b;

    /* renamed from: c */
    public final View f15670c;

    /* renamed from: d */
    public final evl f15671d;

    /* renamed from: e */
    public final Context f15672e;

    /* renamed from: f */
    public final fgt f15673f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public ete(Object obj, LinearLayout linearLayout, evl evl, fgt fgt) {
        this.f15668a = obj;
        this.f15669b = linearLayout;
        this.f15671d = evl;
        Context context = linearLayout.getContext();
        this.f15672e = context;
        this.f15670c = LayoutInflater.from(context).inflate(mo10500a(), (ViewGroup) this.f15669b, false);
        this.f15673f = fgt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo10500a();
}
