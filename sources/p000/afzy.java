package p000;

import android.database.Cursor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.RingtoneManager;
import android.os.Build;

/* renamed from: afzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afzy extends afzs {

    /* renamed from: a */
    final /* synthetic */ afzv f65049a;

    public afzy(afzv afzv) {
        this.f65049a = afzv;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r3 != null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067  */
    /* renamed from: a */
    public final Boolean mo35120a() {
        Cursor cursor;
        afzv afzv = this.f65049a;
        RingtoneManager ringtoneManager = new RingtoneManager(afzv.f65047k);
        try {
            cursor = ringtoneManager.getCursor();
            boolean z = false;
            int i = 0;
            while (i < cursor.getCount()) {
                try {
                    cursor.moveToPosition(i);
                    if (!"Orion".equals(cursor.getString(1)) || !afzv.mo35125a(ringtoneManager.getRingtoneUri(i))) {
                        i++;
                    } else {
                        if (cursor == null) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                        cursor.close();
                        z = true;
                        return Boolean.valueOf(z);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            int[] iArr = afzv.f65036a;
            int length = iArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!afzv.mo35125a(RingtoneManager.getActualDefaultRingtoneUri(afzv.f65047k, iArr[i2]))) {
                    i2++;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return Boolean.valueOf(z);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return mo35120a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((Boolean) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35121a(Boolean bool) {
        int i;
        afzv afzv = this.f65049a;
        boolean booleanValue = bool.booleanValue();
        agac.m53792b("Android Device Manager ringing [%s]", Boolean.valueOf(booleanValue));
        afzv.f65044h = afzv.f65038b.getStreamVolume(4);
        int i2 = Build.VERSION.SDK_INT;
        sex a = sex.m35104a(afzv.f65047k);
        if (a != null) {
            i = a.mo25451d();
        } else {
            i = 0;
        }
        if (i == 3 || i == 0) {
            int ringerMode = afzv.f65038b.getRingerMode();
            afzv.f65045i = ringerMode;
            if (ringerMode != 2) {
                try {
                    afzv.f65038b.setRingerMode(2);
                } catch (SecurityException e) {
                    afyu.m53686a(new cake[]{cake.GMS_PERMISSION_DENIED}, null, null, null, (String) afzd.f64998l.mo10351a(), null, afzw.m53778a(afzv.f65047k), null, null, null);
                }
            }
        }
        AudioManager audioManager = afzv.f65038b;
        audioManager.setStreamVolume(4, audioManager.getStreamMaxVolume(4), 0);
        if (booleanValue) {
            try {
                afzv.f65039c.setOnErrorListener(afzv);
                afzv.f65039c.setOnPreparedListener(afzv);
                int i3 = Build.VERSION.SDK_INT;
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setUsage(4);
                afzv.f65039c.setAudioAttributes(builder.build());
                afzv.f65039c.setLooping(true);
                afzv.f65039c.prepareAsync();
            } catch (IllegalStateException e2) {
                agac.m53790a("Error preparing ringtone.", new Object[0]);
                afzv.f65046j.mo35107b();
            }
        } else {
            afzv.f65040d = new afzu();
            afzv.f65040d.start();
        }
        new adzt().postDelayed(this.f65049a.f65042f, 300000);
    }
}
