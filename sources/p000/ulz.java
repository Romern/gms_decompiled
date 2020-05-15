package p000;

import android.content.ContentValues;

/* renamed from: ulz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ulz extends uny {

    /* renamed from: d */
    public static final /* synthetic */ int f48173d = 0;

    /* renamed from: a */
    public final String f48174a;

    /* renamed from: b */
    public final Long f48175b;

    /* renamed from: c */
    public String f48176c;

    /* renamed from: e */
    private final String f48177e;

    /* renamed from: f */
    private final ukk f48178f;

    public ulz(uno uno, long j, String str, String str2, Long l, ukk ukk, String str3) {
        super(uno, umc.f48191a, j);
        String str4;
        this.f48174a = vpc.m40993a(str);
        if (str2 != null) {
            str4 = vpc.m40993a(str2);
        } else {
            str4 = null;
        }
        this.f48177e = str4;
        this.f48175b = l;
        sdo.m34959a(ukk);
        this.f48178f = ukk;
        this.f48176c = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(umb.CONTENT_HASH.f48190k.mo27700a(), this.f48174a);
        contentValues.put(umb.BASE_CONTENT_HASH.f48190k.mo27700a(), this.f48177e);
        if (this.f48175b != null) {
            contentValues.put(umb.ACTION_ID.f48190k.mo27700a(), this.f48175b);
        } else {
            contentValues.putNull(umb.ACTION_ID.f48190k.mo27700a());
        }
        contentValues.put(umb.ENTRY_ID.f48190k.mo27700a(), Long.valueOf(this.f48178f.f47941a));
        if (this.f48176c != null) {
            contentValues.put(umb.UPLOAD_URI.f48190k.mo27700a(), this.f48176c);
        } else {
            contentValues.putNull(umb.UPLOAD_URI.f48190k.mo27700a());
        }
    }

    public final String toString() {
        String str = this.f48174a;
        String str2 = this.f48177e;
        String valueOf = String.valueOf(this.f48175b);
        String valueOf2 = String.valueOf(this.f48178f);
        String str3 = this.f48176c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 85 + length2 + length3 + String.valueOf(valueOf2).length() + String.valueOf(str3).length());
        sb.append("PendingUpload [contentHash='");
        sb.append(str);
        sb.append("', baseContentHash='");
        sb.append(str2);
        sb.append("', actionId=");
        sb.append(valueOf);
        sb.append(", entrySpec=");
        sb.append(valueOf2);
        sb.append(", uploadUri=");
        sb.append(str3);
        sb.append(']');
        return sb.toString();
    }
}
