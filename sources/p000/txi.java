package p000;

import com.google.android.gms.drive.internal.FileUploadPreferencesImpl;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: txi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class txi {

    /* renamed from: a */
    public static final txg f46909a = new txh(1, true, PSKKeyManager.MAX_KEY_LENGTH_BYTES);

    /* renamed from: b */
    public int f46910b;

    /* renamed from: c */
    public boolean f46911c;

    /* renamed from: d */
    public int f46912d;

    public txi() {
        this(f46909a);
    }

    /* renamed from: a */
    public final txg mo26871a() {
        return new txh(this.f46910b, this.f46911c, this.f46912d);
    }

    public txi(FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.f46910b = fileUploadPreferencesImpl.mo18192a();
        this.f46911c = fileUploadPreferencesImpl.f30850c;
        this.f46912d = fileUploadPreferencesImpl.mo18193b();
    }

    public txi(txg txg) {
        this.f46910b = txg.mo18217a();
        this.f46911c = txg.mo18218b();
        this.f46912d = txg.mo18219c();
    }
}
