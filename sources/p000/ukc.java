package p000;

import android.content.ContentValues;
import com.google.android.gms.drive.Permission;

/* renamed from: ukc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ukc extends uny {

    /* renamed from: l */
    public static final /* synthetic */ int f47841l = 0;

    /* renamed from: a */
    public String f47842a;

    /* renamed from: b */
    public String f47843b;

    /* renamed from: c */
    public String f47844c;

    /* renamed from: d */
    public int f47845d;

    /* renamed from: e */
    public String f47846e;

    /* renamed from: f */
    public int f47847f;

    /* renamed from: g */
    public Integer f47848g;

    /* renamed from: h */
    public Long f47849h;

    /* renamed from: i */
    public boolean f47850i;

    /* renamed from: j */
    public Boolean f47851j;

    /* renamed from: k */
    public Long f47852k;

    /* renamed from: n */
    private long f47853n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ukc(uno uno, long j, long j2, String str, String str2, String str3, int i, String str4, int i2, Long l, Long l2, boolean z, Boolean bool, Long l3) {
        super(uno, ukf.f47868a, j);
        sdo.m34970a(Permission.m22930a(i));
        boolean z2 = true;
        if (!Permission.m22931b(this.f47847f) && this.f47847f != -100) {
            z2 = false;
        }
        sdo.m34970a(z2);
        this.f47853n = j2;
        this.f47842a = str;
        this.f47843b = str2;
        this.f47844c = str3;
        this.f47845d = i;
        this.f47846e = str4;
        this.f47847f = i2;
        this.f47848g = l != null ? Integer.valueOf(l.intValue()) : null;
        this.f47849h = l2;
        this.f47850i = z;
        this.f47851j = bool;
        this.f47852k = l3;
    }

    /* renamed from: a */
    public final void mo27644a(int i, long j) {
        boolean z = true;
        if (!Permission.m22931b(i) && i != -100) {
            z = false;
        }
        sdo.m34970a(z);
        if (this.f47849h == null) {
            this.f47848g = Integer.valueOf(this.f47847f);
        }
        this.f47847f = i;
        this.f47849h = Long.valueOf(j);
    }

    /* renamed from: b */
    public final boolean mo27648b() {
        return this.f47847f == -100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(uke.ENTRY_ID.f47867m.mo27700a(), Long.valueOf(this.f47853n));
        contentValues.put(uke.PERMISSION_ID.f47867m.mo27700a(), this.f47842a);
        contentValues.put(uke.ACCOUNT_IDENTIFIER.f47867m.mo27700a(), this.f47843b);
        contentValues.put(uke.ACCOUNT_NAME.f47867m.mo27700a(), this.f47844c);
        contentValues.put(uke.ACCOUNT_TYPE.f47867m.mo27700a(), Integer.valueOf(this.f47845d));
        contentValues.put(uke.PHOTO_LINK.f47867m.mo27700a(), this.f47846e);
        contentValues.put(uke.ROLE.f47867m.mo27700a(), Integer.valueOf(this.f47847f));
        contentValues.put(uke.GENOA_ROLE_VALUE.f47867m.mo27700a(), this.f47848g);
        contentValues.put(uke.GENOA_ROLE_ACTION_ID.f47867m.mo27700a(), this.f47849h);
        contentValues.put(uke.IS_LINK_REQUIRED.f47867m.mo27700a(), Boolean.valueOf(this.f47850i));
        contentValues.put(uke.GENOA_IS_LINK_REQUIRED_VALUE.f47867m.mo27700a(), this.f47851j);
        contentValues.put(uke.GENOA_IS_LINK_REQUIRED_ACTION_ID.f47867m.mo27700a(), this.f47852k);
    }

    public ukc(uno uno, long j, String str, String str2, String str3, int i, String str4, int i2, Long l, Long l2, boolean z, Boolean bool, Long l3) {
        this(uno, -1, j, str, str2, str3, i, str4, i2, l, l2, z, bool, l3);
    }

    /* renamed from: a */
    public final void mo27645a(uhm uhm) {
        sdo.m34970a(uhm.mo27382b());
        if (this.f47849h == null) {
            uhm.mo27425b(this);
            return;
        }
        this.f47848g = -100;
        uhm.mo27414a(this);
    }

    /* renamed from: a */
    public final void mo27646a(uhm uhm, com.google.android.gms.drive.internal.model.Permission permission) {
        int b;
        int a = vph.m41008a(permission);
        if (a != -1 && (b = vph.m41013b(permission)) != -1) {
            this.f47842a = permission.f31040e;
            this.f47845d = b;
            this.f47843b = vph.m41014c(permission);
            this.f47844c = permission.f31041f;
            this.f47846e = permission.f31042g;
            if (this.f47849h != null) {
                this.f47848g = Integer.valueOf(a);
            } else {
                this.f47847f = a;
            }
            boolean z = permission.f31046k;
            if (this.f47852k != null) {
                this.f47851j = Boolean.valueOf(z);
            } else {
                this.f47850i = z;
            }
            uhm.mo27414a(this);
        }
    }

    /* renamed from: a */
    public final void mo27647a(boolean z, long j) {
        if (this.f47852k == null) {
            this.f47851j = Boolean.valueOf(this.f47850i);
        }
        this.f47850i = z;
        this.f47852k = Long.valueOf(j);
    }
}
