package p000;

import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;
import java.util.Iterator;

/* renamed from: azjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azjs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Cursor f99529a;

    /* renamed from: b */
    final /* synthetic */ azju f99530b;

    public azjs(azju azju, Cursor cursor) {
        this.f99530b = azju;
        this.f99529a = cursor;
    }

    public final void run() {
        boolean z;
        svm svm;
        int length;
        azju azju = this.f99530b;
        Cursor cursor = this.f99529a;
        if (cursor != null) {
            while (cursor.moveToNext()) {
                azcb a = azcb.m85239a(cursor);
                if (!"businessmessaging".equals(a.mo54588a())) {
                    Iterator it = bmyx.m108640a(';').mo66918a((CharSequence) cfeo.m138847D()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals(a.mo54588a())) {
                                break;
                            }
                        } else {
                            MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity = azju.f99534a;
                            int i = MatchstickSettingsChimeraActivity.f111130A;
                            if (matchstickSettingsChimeraActivity.f111157v.get(a.mo54588a()) == null) {
                                svm = new svm(azju.f99534a.getApplicationContext());
                                azju.f99534a.f111157v.put(a.mo54588a(), svm);
                                z = false;
                            } else {
                                svm = (svm) azju.f99534a.f111157v.get(a.mo54588a());
                                z = true;
                            }
                            svm.mo26085a(a.mo54590c());
                            byte[] d = a.mo54591d();
                            if (d != null && (length = d.length) > 0) {
                                svm.mo26101a(new BitmapDrawable(azju.f99534a.getResources(), BitmapFactory.decodeByteArray(d, 0, length)));
                            } else {
                                svm.mo26101a(new BitmapDrawable(azju.f99534a.getResources(), azpi.m86076b(azju.f99534a.f111154s)));
                            }
                            svm.setChecked(!a.mo54592e());
                            svm.mo26102a(new azjt(azju, svm, a));
                            if (!z) {
                                azju.f99535b.mo26149a((sui) svm);
                            }
                        }
                    }
                }
            }
            cursor.close();
        }
    }
}
