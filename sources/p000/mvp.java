package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import java.util.Date;

/* renamed from: mvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mvp {

    /* renamed from: a */
    public static final mvp f34814a = new mvo(C0126R.string.drive_backup_content_status_never, new Object[0]);

    /* renamed from: b */
    public static final mvp f34815b = new mvo(C0126R.string.drive_backup_content_status_sync_off, new Object[0]);

    /* renamed from: c */
    public static final mvp f34816c = new mvo(C0126R.string.common_off, new Object[0]);

    /* renamed from: d */
    public static final mvp f34817d = new mvo(C0126R.string.drive_backup_content_status_updating, new Object[0]);

    /* renamed from: e */
    public static final mvp f34818e = new mvo(C0126R.string.common_off, new Object[0]);

    /* renamed from: f */
    public static final mvp f34819f = new mvo(C0126R.string.drive_backup_content_status_error, new Object[0]);

    /* renamed from: a */
    public static mvp m25668a(Date date) {
        return new mvn(date);
    }

    /* renamed from: b */
    public static mvp m25669b(Date date) {
        return new mvn(date);
    }

    /* renamed from: a */
    public abstract String mo20275a(Context context);
}
