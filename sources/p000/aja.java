package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: aja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aja extends aix {

    /* renamed from: a */
    private final int f631a;

    /* renamed from: j */
    private final int f632j;

    /* renamed from: k */
    private final LayoutInflater f633k;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aix.<init>(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      aix.<init>(android.content.Context, android.database.Cursor):void
      aix.<init>(android.content.Context, boolean):void */
    @Deprecated
    public aja(Context context, int i) {
        super(context, true);
        this.f632j = i;
        this.f631a = i;
        this.f633k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public View mo430a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f633k.inflate(this.f631a, viewGroup, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: b */
    public final View mo803b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f633k.inflate(this.f632j, viewGroup, false);
    }

    public aja(Context context, Cursor cursor) {
        super(context, cursor);
        this.f632j = 17367044;
        this.f631a = 17367044;
        this.f633k = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
