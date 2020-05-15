package p000;

import android.content.ContentValues;

/* renamed from: ukp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ukp extends unq {

    /* renamed from: g */
    public static final /* synthetic */ int f48032g = 0;

    /* renamed from: a */
    public final String f48033a;

    /* renamed from: b */
    public String f48034b;

    /* renamed from: c */
    public String f48035c;

    /* renamed from: d */
    public vow f48036d;

    /* renamed from: e */
    public long f48037e;

    /* renamed from: f */
    public final long f48038f;

    public ukp(uko uko, boolean z) {
        super(uko.f48025a, uks.f48051a, z);
        this.f48033a = uko.f48026b;
        this.f48037e = uko.f48030f;
        this.f48038f = uko.f48031g;
        this.f48034b = uko.f48027c;
        this.f48035c = uko.f48028d;
        this.f48036d = uko.f48029e;
        boolean z2 = true;
        if (this.f48034b == null && this.f48035c == null) {
            z2 = false;
        }
        sdo.m34975b(z2, "At least one of internalFilename or sharedFilename must be set.");
    }

    /* renamed from: a */
    public static uko m38865a(uno uno, String str, long j, long j2) {
        return new uko(uno, str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo27515b(ContentValues contentValues) {
        contentValues.put(ukr.CONTENT_HASH.f48050k.mo27700a(), this.f48033a);
        contentValues.put(ukr.LAST_ACCESSED.f48050k.mo27700a(), Long.valueOf(this.f48037e));
        contentValues.put(ukr.SIZE_BYTES.f48050k.mo27700a(), Long.valueOf(this.f48038f));
        if (this.f48034b != null) {
            contentValues.put(ukr.INTERNAL_FILE_NAME.f48050k.mo27700a(), this.f48034b);
        } else {
            contentValues.putNull(ukr.INTERNAL_FILE_NAME.f48050k.mo27700a());
        }
        if (this.f48035c != null) {
            contentValues.put(ukr.SHARED_FILE_NAME.f48050k.mo27700a(), this.f48035c);
        } else {
            contentValues.putNull(ukr.SHARED_FILE_NAME.f48050k.mo27700a());
        }
        if (this.f48036d != null) {
            contentValues.put(ukr.ENCRYPTION_KEY.f48050k.mo27700a(), this.f48036d.f49687a.getEncoded());
            contentValues.put(ukr.ENCRYPTION_ALGORITHM.f48050k.mo27700a(), this.f48036d.f49687a.getAlgorithm());
            vow vow = this.f48036d;
            if (vow.f49688b == null || vow.f49689c == null) {
                contentValues.putNull(ukr.ENCRYPTION_ALGORITHM_PARAMETERS.f48050k.mo27700a());
                contentValues.putNull(ukr.ENCRYPTION_ALGORITHM_IV.f48050k.mo27700a());
                return;
            }
            contentValues.put(ukr.ENCRYPTION_ALGORITHM_PARAMETERS.f48050k.mo27700a(), this.f48036d.f49688b);
            contentValues.put(ukr.ENCRYPTION_ALGORITHM_IV.f48050k.mo27700a(), this.f48036d.f49689c);
            return;
        }
        contentValues.putNull(ukr.ENCRYPTION_KEY.f48050k.mo27700a());
        contentValues.putNull(ukr.ENCRYPTION_ALGORITHM.f48050k.mo27700a());
        contentValues.putNull(ukr.ENCRYPTION_ALGORITHM_PARAMETERS.f48050k.mo27700a());
        contentValues.putNull(ukr.ENCRYPTION_ALGORITHM_IV.f48050k.mo27700a());
    }

    public final String toString() {
        String str = this.f48033a;
        String str2 = this.f48034b;
        String str3 = this.f48035c;
        String valueOf = String.valueOf(this.f48036d);
        long j = this.f48037e;
        long j2 = this.f48038f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 145 + length2 + String.valueOf(str3).length() + String.valueOf(valueOf).length());
        sb.append("FileContent [contentHash=");
        sb.append(str);
        sb.append(", internalFilename=");
        sb.append(str2);
        sb.append(", sharedFilename=");
        sb.append(str3);
        sb.append(", encryptionSpec=");
        sb.append(valueOf);
        sb.append(", lastAccessedTime=");
        sb.append(j);
        sb.append(", size=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final uog mo27514a() {
        return ukr.CONTENT_HASH.f48050k.mo27708b(this.f48033a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo27661a(String str) {
        if (str == null) {
            sdo.m34971a(this.f48035c != null, (Object) "internal and shared filenames cannot both be null");
        }
        this.f48034b = str;
    }
}
