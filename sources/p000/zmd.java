package p000;

import android.content.Intent;
import android.net.Uri;

/* renamed from: zmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zmd extends zlz {

    /* renamed from: d */
    private final zme f55441d;

    protected zmd(zme zme, String str, yzs yzs) {
        super(zme, str, yzs);
        this.f55441d = zme;
    }

    /* renamed from: b */
    public abstract void mo31242b(String str);

    /* renamed from: b */
    public abstract boolean mo31243b();

    /* renamed from: c */
    public void mo31244c() {
    }

    /* renamed from: d */
    public abstract boolean mo31245d();

    /* renamed from: e */
    public final void mo31246e() {
        zme zme = this.f55441d;
        zme.getClass().getSimpleName();
        if (!zme.f55443g.contains(this) && zme.f55443g.add(this) && zme.f55443g.size() == 1) {
            Intent intent = new Intent("com.google.android.gms.fitness.START_SELF", (Uri) null);
            intent.setClassName(zme, zme.f55444h);
            zme.startService(intent);
        }
    }

    /* renamed from: f */
    public final void mo31247f() {
        this.f55441d.mo31250a(this);
    }

    /* renamed from: g */
    public abstract void mo31248g();
}
