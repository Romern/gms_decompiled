package p000;

import com.google.android.gms.common.api.Scope;

@Deprecated
/* renamed from: twn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class twn {

    /* renamed from: a */
    public static final Scope f46755a = new Scope("https://www.googleapis.com/auth/drive");

    /* renamed from: b */
    public static final Scope f46756b = new Scope("https://www.googleapis.com/auth/drive.apps");
    @Deprecated

    /* renamed from: c */
    public static final rjo f46757c = new rjo("Drive.API", f46761g, f46760f);

    /* renamed from: d */
    public static final rjo f46758d = new rjo("Drive.INTERNAL_API", f46762h, f46760f);
    @Deprecated

    /* renamed from: e */
    public static final two f46759e = new usf();

    /* renamed from: f */
    public static final rje f46760f = new rje();

    /* renamed from: g */
    private static final rjl f46761g = new twh();

    /* renamed from: h */
    private static final rjl f46762h = new twi();

    /* renamed from: i */
    private static final rjl f46763i = new twj();

    static {
        new Scope("https://www.googleapis.com/auth/drive.file");
        new Scope("https://www.googleapis.com/auth/drive.appdata");
        new rjo("Drive.API_CONNECTIONLESS", f46763i, f46760f);
    }
}
