package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.profile.AvatarChimeraActivity;
import java.io.FileNotFoundException;
import java.io.OutputStream;

/* renamed from: amik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amik implements rkl {

    /* renamed from: a */
    final /* synthetic */ AvatarChimeraActivity f74941a;

    public amik(AvatarChimeraActivity avatarChimeraActivity) {
        this.f74941a = avatarChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        OutputStream outputStream;
        Bitmap bitmap;
        allh allh = (allh) rkk;
        Status bo = allh.mo7183bo();
        ParcelFileDescriptor b = allh.mo40486b();
        try {
            outputStream = null;
            if (!bo.mo17710c()) {
                bitmap = null;
            } else {
                bitmap = b != null ? alls.m61238a(b) : null;
            }
            if (bitmap == null) {
                Log.w("People.Avatar", "Failed to decode remote photo");
                this.f74941a.mo46371f();
                this.f74941a.mo46369d();
            } else {
                Uri a = amio.m62946a(this.f74941a, "remote-avatar.jpg");
                if (a == null) {
                    Log.w("People.Avatar", "Failed to get temp file for remote photo");
                    this.f74941a.mo46371f();
                    this.f74941a.mo46369d();
                } else {
                    try {
                        outputStream = this.f74941a.getContentResolver().openOutputStream(a);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, (int) cgbe.m144181j(), outputStream);
                            AvatarChimeraActivity avatarChimeraActivity = this.f74941a;
                            avatarChimeraActivity.f81950d = a;
                            avatarChimeraActivity.mo46366a(avatarChimeraActivity.f81950d);
                        } catch (FileNotFoundException e) {
                            e = e;
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        Log.e("People.Avatar", "Failed to compress remove photo to temp file", e);
                        srz.m36171a(outputStream);
                        srz.m36170a(b);
                    } catch (Throwable th) {
                        th = th;
                        srz.m36171a(outputStream);
                        throw th;
                    }
                    srz.m36171a(outputStream);
                }
            }
            srz.m36170a(b);
        } catch (Throwable th2) {
            srz.m36170a(b);
            throw th2;
        }
    }
}
