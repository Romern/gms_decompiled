package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: bsjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjw {

    /* renamed from: a */
    static final Comparator f144851a = bnny.m109908a(bsju.f144849a).mo68163b(bsjv.f144850a);

    /* renamed from: c */
    public static final /* synthetic */ int f144852c = 0;

    /* renamed from: b */
    public final ArrayList f144853b = new ArrayList();

    /* renamed from: d */
    private String f144854d;

    /* renamed from: e */
    private bytz f144855e;

    /* renamed from: f */
    private bngs f144856f;

    /* renamed from: g */
    private bngx f144857g;

    /* renamed from: a */
    public final bsjx mo70632a() {
        Collections.sort(this.f144853b, f144851a);
        if (this.f144856f == null) {
            if (this.f144857g != null) {
                bngs j = bngx.m109377j();
                this.f144856f = j;
                j.mo67666b((Iterable) this.f144857g);
                this.f144857g = null;
            } else {
                this.f144856f = bngx.m109377j();
            }
        }
        this.f144856f.mo67666b((Iterable) this.f144853b);
        bngs bngs = this.f144856f;
        if (bngs != null) {
            this.f144857g = bngs.mo67664a();
        } else if (this.f144857g == null) {
            this.f144857g = bngx.m109376e();
        }
        String str = this.f144854d == null ? " id" : "";
        if (this.f144855e == null) {
            str = str.concat(" groupBrandingInfo");
        }
        if (str.isEmpty()) {
            return new bsjy(this.f144854d, this.f144855e, this.f144857g);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo70633a(bytz bytz) {
        if (bytz != null) {
            this.f144855e = bytz;
            return;
        }
        throw new NullPointerException("Null groupBrandingInfo");
    }

    /* renamed from: a */
    public final void mo70634a(String str) {
        if (str != null) {
            this.f144854d = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final void mo70635a(Collection collection) {
        this.f144853b.addAll(collection);
    }
}
