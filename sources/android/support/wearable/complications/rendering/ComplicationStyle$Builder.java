package android.support.wearable.complications.rendering;

import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ComplicationStyle$Builder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aff();

    /* renamed from: a */
    public int f1388a = -16777216;

    /* renamed from: b */
    public Drawable f1389b = null;

    /* renamed from: c */
    public int f1390c = -1;

    /* renamed from: d */
    public int f1391d = -3355444;

    /* renamed from: e */
    public Typeface f1392e = afg.f403a;

    /* renamed from: f */
    public Typeface f1393f = afg.f403a;

    /* renamed from: g */
    public int f1394g = Integer.MAX_VALUE;

    /* renamed from: h */
    public int f1395h = Integer.MAX_VALUE;

    /* renamed from: i */
    public ColorFilter f1396i = null;

    /* renamed from: j */
    public int f1397j = -1;

    /* renamed from: k */
    public int f1398k = -1;

    /* renamed from: l */
    public int f1399l = 3;

    /* renamed from: m */
    public int f1400m = 3;

    /* renamed from: n */
    public int f1401n = Integer.MAX_VALUE;

    /* renamed from: o */
    public int f1402o = 1;

    /* renamed from: p */
    public int f1403p = 2;

    /* renamed from: q */
    public int f1404q = -1;

    /* renamed from: r */
    public int f1405r = -3355444;

    /* renamed from: s */
    public int f1406s = -3355444;

    /* renamed from: t */
    private int f1407t = 1;

    public ComplicationStyle$Builder() {
    }

    /* renamed from: a */
    public final afg mo1810a() {
        return new afg(this.f1388a, this.f1389b, this.f1390c, this.f1391d, this.f1392e, this.f1393f, this.f1394g, this.f1395h, this.f1396i, this.f1397j, this.f1398k, this.f1407t, this.f1401n, this.f1402o, this.f1399l, this.f1400m, this.f1403p, this.f1404q, this.f1405r, this.f1406s);
    }

    /* renamed from: a */
    public final void mo1811a(int i) {
        if (i == 1) {
            this.f1407t = 1;
        } else if (i != 2) {
            this.f1407t = 0;
        } else {
            this.f1407t = 2;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("background_color", this.f1388a);
        bundle.putInt("text_color", this.f1390c);
        bundle.putInt("title_color", this.f1391d);
        bundle.putInt("text_style", this.f1392e.getStyle());
        bundle.putInt("title_style", this.f1393f.getStyle());
        bundle.putInt("text_size", this.f1394g);
        bundle.putInt("title_size", this.f1395h);
        bundle.putInt("icon_color", this.f1397j);
        bundle.putInt("border_color", this.f1398k);
        bundle.putInt("border_style", this.f1407t);
        bundle.putInt("border_dash_width", this.f1399l);
        bundle.putInt("border_dash_gap", this.f1400m);
        bundle.putInt("border_radius", this.f1401n);
        bundle.putInt("border_width", this.f1402o);
        bundle.putInt("ranged_value_ring_width", this.f1403p);
        bundle.putInt("ranged_value_primary_color", this.f1404q);
        bundle.putInt("ranged_value_secondary_color", this.f1405r);
        bundle.putInt("highlight_color", this.f1406s);
        parcel.writeBundle(bundle);
    }

    public ComplicationStyle$Builder(afg afg) {
        this.f1388a = afg.f404b;
        this.f1389b = afg.f405c;
        this.f1390c = afg.f406d;
        this.f1391d = afg.f407e;
        this.f1392e = afg.f408f;
        this.f1393f = afg.f409g;
        this.f1394g = afg.f410h;
        this.f1395h = afg.f411i;
        this.f1396i = afg.f412j;
        this.f1397j = afg.f413k;
        this.f1398k = afg.f414l;
        this.f1407t = afg.f415m;
        this.f1399l = afg.f416n;
        this.f1400m = afg.f417o;
        this.f1401n = afg.f418p;
        this.f1402o = afg.f419q;
        this.f1403p = afg.f420r;
        this.f1404q = afg.f421s;
        this.f1405r = afg.f422t;
        this.f1406s = afg.f423u;
    }

    public ComplicationStyle$Builder(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.f1388a = readBundle.getInt("background_color");
        this.f1390c = readBundle.getInt("text_color");
        this.f1391d = readBundle.getInt("title_color");
        this.f1392e = Typeface.defaultFromStyle(readBundle.getInt("text_style", 0));
        this.f1393f = Typeface.defaultFromStyle(readBundle.getInt("title_style", 0));
        this.f1394g = readBundle.getInt("text_size");
        this.f1395h = readBundle.getInt("title_size");
        this.f1397j = readBundle.getInt("icon_color");
        this.f1398k = readBundle.getInt("border_color");
        this.f1407t = readBundle.getInt("border_style");
        this.f1399l = readBundle.getInt("border_dash_width");
        this.f1400m = readBundle.getInt("border_dash_gap");
        this.f1401n = readBundle.getInt("border_radius");
        this.f1402o = readBundle.getInt("border_width");
        this.f1403p = readBundle.getInt("ranged_value_ring_width");
        this.f1404q = readBundle.getInt("ranged_value_primary_color");
        this.f1405r = readBundle.getInt("ranged_value_secondary_color");
        this.f1406s = readBundle.getInt("highlight_color");
    }

    public ComplicationStyle$Builder(ComplicationStyle$Builder complicationStyle$Builder) {
        this.f1388a = complicationStyle$Builder.f1388a;
        this.f1389b = complicationStyle$Builder.f1389b;
        this.f1390c = complicationStyle$Builder.f1390c;
        this.f1391d = complicationStyle$Builder.f1391d;
        this.f1392e = complicationStyle$Builder.f1392e;
        this.f1393f = complicationStyle$Builder.f1393f;
        this.f1394g = complicationStyle$Builder.f1394g;
        this.f1395h = complicationStyle$Builder.f1395h;
        this.f1396i = complicationStyle$Builder.f1396i;
        this.f1397j = complicationStyle$Builder.f1397j;
        this.f1398k = complicationStyle$Builder.f1398k;
        this.f1407t = complicationStyle$Builder.f1407t;
        this.f1399l = complicationStyle$Builder.f1399l;
        this.f1400m = complicationStyle$Builder.f1400m;
        this.f1401n = complicationStyle$Builder.f1401n;
        this.f1402o = complicationStyle$Builder.f1402o;
        this.f1403p = complicationStyle$Builder.f1403p;
        this.f1404q = complicationStyle$Builder.f1404q;
        this.f1405r = complicationStyle$Builder.f1405r;
        this.f1406s = complicationStyle$Builder.f1406s;
    }
}
