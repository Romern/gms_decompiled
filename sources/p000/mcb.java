package p000;

import android.content.Context;
import java.io.File;

/* renamed from: mcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mcb {

    /* renamed from: a */
    public File f33396a;

    /* renamed from: b */
    public File f33397b;

    /* renamed from: c */
    private final Context f33398c;

    public mcb(Context context) {
        this.f33398c = context;
        mo19846a();
    }

    /* renamed from: a */
    public final File mo19845a(String str) {
        return new File(this.f33396a, String.valueOf(str).concat("_temp"));
    }

    /* renamed from: b */
    public final File mo19847b(String str) {
        return new File(this.f33397b, str);
    }

    /* renamed from: a */
    public final synchronized void mo19846a() {
        this.f33396a = mce.m24857a(this.f33398c, "d2d_backup_data");
        this.f33397b = new File(this.f33398c.getFilesDir(), "d2d_restore_data");
        this.f33396a.mkdirs();
        this.f33397b.mkdirs();
    }
}
