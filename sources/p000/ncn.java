package p000;

import java.io.File;

/* renamed from: ncn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ncn {

    /* renamed from: a */
    public final File f35288a;

    /* renamed from: b */
    public final naz f35289b;

    /* renamed from: c */
    public final ncp f35290c;

    /* renamed from: d */
    public final ncb f35291d;

    /* renamed from: e */
    public final ltj f35292e;

    public ncn(File file, naz naz, ncp ncp, ncb ncb, ltj ltj) {
        bmxy.m108589a(file.isDirectory(), "Temporary folder must be an existing directory");
        this.f35288a = file;
        this.f35289b = naz;
        this.f35290c = ncp;
        this.f35291d = ncb;
        this.f35292e = ltj;
    }
}
