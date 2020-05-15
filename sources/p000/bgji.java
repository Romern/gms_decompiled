package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;

/* renamed from: bgji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgji implements bgmm {

    /* renamed from: a */
    public final Context f116606a;

    /* renamed from: b */
    public final ExecutorService f116607b = adzl.f62962b.mo25879b(2);

    /* renamed from: c */
    private final bfor f116608c;

    /* renamed from: d */
    private final int f116609d;

    public bgji(Context context, bfor bfor, int i) {
        this.f116606a = context;
        this.f116608c = bfor;
        this.f116609d = i;
    }

    /* renamed from: a */
    public static File m99081a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return new File(cacheDir, "nlp_s");
        }
        return null;
    }

    /* renamed from: b */
    public static File m99083b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return new File(filesDir, "nlp_ioh");
        }
        return null;
    }

    /* renamed from: c */
    public final File mo62783c() {
        m99082a(bfos.NLP_PARAMS_STATE_DIR);
        return this.f116606a.getFilesDir();
    }

    /* renamed from: d */
    public final File mo62784d() {
        return m99081a(this.f116606a);
    }

    /* renamed from: e */
    public final File mo62785e() {
        return m99083b(this.f116606a);
    }

    /* renamed from: f */
    public final ExecutorService mo62786f() {
        return this.f116607b;
    }

    /* renamed from: g */
    public final int mo62787g() {
        return this.f116609d;
    }

    /* renamed from: h */
    public final File mo62788h() {
        m99082a(bfos.COLLECTOR_STATE_DIR);
        return this.f116606a.getFilesDir();
    }

    /* renamed from: i */
    public final File mo62789i() {
        m99082a(bfos.COLLECTION_POLICY_STATE_DIR);
        return this.f116606a.getFilesDir();
    }

    /* renamed from: a */
    private final void m99082a(bfos bfos) {
        this.f116608c.mo62048a(bfos);
    }

    /* renamed from: b */
    public final File mo62782b() {
        m99082a(bfos.PERSISTENT_STATE_DIR);
        return this.f116606a.getCacheDir();
    }

    /* renamed from: a */
    public final File mo62779a() {
        m99082a(bfos.SEEN_DEVICES_DIR);
        return this.f116606a.getCacheDir();
    }

    /* renamed from: a */
    public final InputStream mo62780a(String str) {
        try {
            return this.f116606a.getAssets().openFd(str.length() == 0 ? new String("location/") : "location/".concat(str)).createInputStream();
        } catch (IOException e) {
            if (str.length() == 0) {
                new String("Could not load asset: ");
                return null;
            }
            "Could not load asset: ".concat(str);
            return null;
        }
    }

    /* renamed from: a */
    public final ByteBuffer mo62781a(beve beve) {
        Context context = this.f116606a;
        String valueOf = String.valueOf(beve.f112633u);
        return bhcx.m100660a(context, valueOf.length() == 0 ? new String("location/") : "location/".concat(valueOf), beve.f112631s, beve.f112632t);
    }
}
