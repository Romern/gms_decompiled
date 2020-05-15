package com.google.android.gms.mdm.services;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RingChimeraService extends afzm {

    /* renamed from: o */
    public static final /* synthetic */ int f80056o = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Runnable mo35104a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final cajt mo35106b(Intent intent) {
        if (intent.getBooleanExtra("includeConnectivityStatus", false)) {
            return afzw.m53780c(this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final afzv mo35108c() {
        return new afzv(this, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo35109d() {
        return C0126R.C0127drawable.mdm_ic_notification;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo35110e() {
        return C0126R.string.common_mdm_feature_name;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo35111f() {
        return C0126R.color.mdm_accent_color;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo35112g() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r3 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r3.release();
        r0.f65039c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r3 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        r3 = r0.f65040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r3 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        r3.f65035a = true;
        r3.interrupt();
        r0.f65040d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        r3 = r0.f65044h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r3 == -1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r0.f65038b.setStreamVolume(4, r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r3 = r0.f65045i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        if (r3 != -1) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        r0.f65038b.setRingerMode(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        new p000.adzt().removeCallbacks(r0.f65042f);
     */
    public final void onDestroy() {
        MediaPlayer mediaPlayer;
        afzv afzv = this.f65023h;
        if (afzv != null) {
            afzv.f65047k.unregisterReceiver(afzv.f65043g);
            afzs afzs = afzv.f65041e;
            if (afzs != null) {
                afzs.cancel(true);
                afzv.f65041e = null;
            }
            try {
                MediaPlayer mediaPlayer2 = afzv.f65039c;
                if (mediaPlayer2 != null) {
                    if (mediaPlayer2.isPlaying()) {
                        afzv.f65039c.stop();
                    }
                }
                mediaPlayer = afzv.f65039c;
            } catch (IllegalStateException e) {
                agac.m53791a(e, "Error stopping playing ringtone.", new Object[0]);
                mediaPlayer = afzv.f65039c;
            } catch (Throwable th) {
                MediaPlayer mediaPlayer3 = afzv.f65039c;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.release();
                    afzv.f65039c = null;
                }
                throw th;
            }
        }
        if (this.f65022g != null && this.f65027l == null) {
            cake[] cakeArr = new cake[1];
            cakeArr[0] = !this.f65018c ? cake.RING_DEVICE_INTERRUPTED : cake.SUCCESS;
            afyu.m53686a(cakeArr, null, null, null, this.f65022g, null, afzw.m53778a(this), null, this, this);
        }
        BroadcastReceiver broadcastReceiver = this.f65016a;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        adzt adzt = this.f65026k;
        if (adzt != null) {
            adzt.removeCallbacks(this.f65028m);
        }
        View view = this.f65020e;
        if (view != null) {
            this.f65019d.removeView(view);
        }
        stopForeground(true);
        String str = this.f65017b;
        if (str != null) {
            agaf.m53796a(this, str, "com.google.android.gms.mdm.RING_CANCELED");
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35105a(Intent intent) {
        this.f65017b = intent.getStringExtra("requestorNodeId");
        fjk a = fip.m11765a(this).mo10855a("UA-45380032-2");
        fir fir = new fir((char[]) null);
        fir.mo10866d("Wear");
        fir.mo10865c("Received wearable command");
        fir.mo10867e("Ring my phone");
        a.mo10893a(fir.mo10861a());
        agaf.m53796a(this, this.f65017b, "com.google.android.gms.mdm.RING_STARTED");
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = eoa.f15378a;
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        stopSelf();
        return true;
    }
}
