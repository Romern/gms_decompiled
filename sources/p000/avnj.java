package p000;

import java.util.Arrays;

/* renamed from: avnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avnj {

    /* renamed from: a */
    public final String f93511a;

    /* renamed from: b */
    public final Object f93512b;

    /* renamed from: c */
    public bmxv f93513c = bmvz.f131120a;

    /* renamed from: d */
    public avte f93514d;

    protected avnj(String str, avte avte) {
        sdo.m34977c(str);
        this.f93511a = str;
        this.f93514d = avte;
        this.f93512b = new Object();
    }

    /* renamed from: a */
    public final avte mo51432a() {
        avte avte;
        synchronized (this.f93512b) {
            avte = this.f93514d;
        }
        return avte;
    }

    /* renamed from: b */
    public abstract void mo51434b();

    /* renamed from: c */
    public abstract avni mo51435c();

    /* renamed from: d */
    public abstract boolean mo51436d();

    public final boolean equals(Object obj) {
        if (obj instanceof avnj) {
            return this.f93511a.equals(((avnj) obj).f93511a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f93511a});
    }

    /* renamed from: a */
    public final Object mo51433a(avti avti) {
        Object a;
        synchronized (this.f93512b) {
            a = this.f93514d.mo51597a(avti);
        }
        return a;
    }
}
