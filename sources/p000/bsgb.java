package p000;

import java.util.ArrayList;

/* renamed from: bsgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgb {

    /* renamed from: a */
    public double f144514a;

    /* renamed from: b */
    public final int f144515b;

    /* renamed from: c */
    public final double f144516c;

    /* renamed from: d */
    public ArrayList f144517d;

    /* renamed from: e */
    public ArrayList f144518e;

    /* renamed from: f */
    public final ArrayList f144519f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f144520g = new ArrayList();

    /* renamed from: h */
    public final bsfv f144521h;

    public bsgb(bsgh bsgh, int i, double d) {
        bsfu[] bsfuArr;
        this.f144515b = i;
        this.f144516c = d;
        bsfv bsfv = new bsfv(new bsfx(bsgh), i);
        this.f144521h = bsfv;
        for (bsfu bsfu : bsfv.f144504b) {
            bsfu.f144502a = new bsft();
        }
    }

    /* renamed from: a */
    public final void mo70524a(bsfz bsfz) {
        this.f144519f.add(bsfz);
    }
}
