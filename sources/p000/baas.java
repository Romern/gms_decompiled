package p000;

import android.content.Context;
import java.io.File;

/* renamed from: baas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baas implements cayy {

    /* renamed from: a */
    private final cijl f100391a;

    /* renamed from: b */
    private final cijl f100392b;

    public baas(cijl cijl, cijl cijl2) {
        this.f100391a = cijl;
        this.f100392b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        baaw baaw = new baaw(cayx.m127580b(this.f100391a), new File(new File(((Context) this.f100392b.mo6445a()).getFilesDir(), "mdh"), "ChannelConfigListStore"), "default");
        cazf.m127593a(baaw, "Cannot return null from a non-@Nullable @Provides method");
        return baaw;
    }
}
