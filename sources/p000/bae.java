package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bae {

    /* renamed from: a */
    public final List f2753a;

    /* renamed from: b */
    public final List f2754b;

    /* renamed from: c */
    public final List f2755c;

    public bae(List list) {
        this.f2755c = list;
        this.f2753a = new ArrayList(list.size());
        this.f2754b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f2753a.add(((bbs) list.get(i)).f2873a.mo2972a());
            this.f2754b.add(((bbs) list.get(i)).f2874b.mo2972a());
        }
    }
}
