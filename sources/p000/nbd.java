package p000;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: nbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbd {

    /* renamed from: a */
    private static final lvn f35171a = new lvn("ProtoStore");

    /* renamed from: b */
    private final bxxk f35172b;

    /* renamed from: c */
    private final File f35173c;

    public nbd(bxxk bxxk, File file) {
        bmxy.m108581a(bxxk);
        this.f35172b = bxxk;
        if (file.exists() && !file.isDirectory()) {
            throw new IOException("Store folder already exists, but isn't a directory.");
        } else if (file.exists() || file.mkdir()) {
            this.f35173c = file;
        } else {
            throw new IOException("Unable to create store folder.");
        }
    }

    /* renamed from: a */
    public static nbd m25878a(Context context) {
        return new nbd((bxxk) mcp.f33431g.mo74142c(7), new File(context.getFilesDir().getAbsoluteFile(), "backup_chunk_listings"));
    }

    /* renamed from: b */
    public static nbd m25879b(Context context) {
        return new nbd((bxxk) mcx.f33458b.mo74142c(7), new File(context.getFilesDir().getAbsoluteFile(), "backup_kv_listings"));
    }

    /* renamed from: c */
    private final File m25880c(String str) {
        if (!TextUtils.isEmpty(str) && !str.contains("/")) {
            return new File(this.f35173c, str);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Package name must not contain '/' or be empty: ") : "Package name must not contain '/' or be empty: ".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo20434b(String str) {
        m25880c(str).delete();
    }

    /* renamed from: a */
    public final bmxv mo20431a(String str) {
        File c = m25880c(str);
        if (c.exists()) {
            return bmxv.m108566b((bxxc) this.f35172b.mo73662b(bobi.m111041b(c), bxus.m123744c()));
        }
        f35171a.mo25412b("No chunk listing existed for %s, returning empty listing.", str);
        return bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo20432a() {
        File[] listFiles = this.f35173c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    public final void mo20433a(String str, bxxc bxxc) {
        bmxy.m108581a(bxxc);
        File c = m25880c(str);
        try {
            bobi.m111040a(bxxc.mo73642k(), c);
        } catch (IOException e) {
            f35171a.mo25418e("Exception occurred when saving the listing for %s, deleting saved listing.", str, e);
            c.delete();
            throw e;
        }
    }
}
