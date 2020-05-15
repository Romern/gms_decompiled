package com.google.android.gms.panorama;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PanoramaViewChimeraActivity extends Activity {

    /* renamed from: a */
    protected alch f81434a;

    /* renamed from: b */
    public alcd f81435b;

    /* renamed from: c */
    public boolean f81436c = false;

    /* renamed from: d */
    public asfb f81437d;

    /* renamed from: e */
    private albs f81438e;

    /* renamed from: f */
    private albp f81439f;

    /* renamed from: g */
    private boolean f81440g;

    /* renamed from: a */
    private final void m67772a() {
        asfb asfb = this.f81437d;
        if (asfb != null && asfb.mo49124e()) {
            this.f81437d.mo49120c();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        albp albp = this.f81439f;
        if (albp != null) {
            albp.mo40096b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean a = cftw.f185707a.mo6606a().mo82721a();
        this.f81440g = a;
        if (a) {
            getWindow().addFlags(128);
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        InputDevice.MotionRange motionRange;
        if ((motionEvent.getSource() & 2097152) == 0) {
            return super.onGenericMotionEvent(motionEvent);
        }
        mo45926a(false);
        InputDevice device = motionEvent.getDevice();
        InputDevice.MotionRange motionRange2 = null;
        if (device != null) {
            motionRange2 = device.getMotionRange(0);
            motionRange = device.getMotionRange(1);
        } else {
            motionRange = null;
        }
        if (motionRange2 == null || motionRange == null) {
            return super.onGenericMotionEvent(motionEvent);
        }
        float max = motionRange2.getMax();
        float max2 = motionRange.getMax();
        View decorView = getWindow().getDecorView();
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        this.f81434a.mo40114a(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX() * (((float) width) / max), motionEvent.getY() * (((float) height) / max2), motionEvent.getMetaState()));
        return true;
    }

    public final void onNewIntent(Intent intent) {
        setIntent(intent);
    }

    public final void onPause() {
        super.onPause();
        this.f81434a.f73405b.f73451l.mo40094a();
        m67772a();
        albs albs = this.f81438e;
        if (albs != null) {
            albs.mo40102a();
        }
    }

    public final void onResume() {
        String str;
        Object obj;
        super.onResume();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility = 1;
        window.setAttributes(attributes);
        this.f81438e = new albs();
        albp albp = new albp(((WindowManager) getSystemService("window")).getDefaultDisplay(), this.f81438e);
        this.f81439f = albp;
        albp.mo40096b();
        Intent intent = getIntent();
        Uri data = intent.getData();
        alcn alcn = null;
        if (data == null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                obj = extras.get("android.intent.extra.STREAM");
            } else {
                obj = null;
            }
            if (obj instanceof Uri) {
                data = (Uri) obj;
            } else {
                data = null;
            }
        }
        if (data != null) {
            try {
                InputStream a = becp.m91786a(this, data);
                File file = new File(getCacheDir(), "temp_pano.jpg");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = a.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                }
                bufferedOutputStream.close();
                str = file.getAbsolutePath();
                String valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                    new String("Wrote stream to temporary file: ");
                } else {
                    "Wrote stream to temporary file: ".concat(valueOf);
                }
            } catch (IOException e) {
                Log.e("PanoramaViewActivity", "Could not open file. ", e);
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            if (this.f81436c) {
                this.f81438e.mo40103a(this);
            }
            m67772a();
            if (!this.f81440g) {
                asfb asfb = new asfb(this, 536870938, "PanoramaViewActivity", null, "com.google.android.gms");
                this.f81437d = asfb;
                asfb.mo49117b();
            }
            if (str.length() == 0) {
                new String("Attempting to show panorama : ");
            } else {
                "Attempting to show panorama : ".concat(str);
            }
            alaq alaq = new alaq(this);
            albz a2 = albz.m60832a(new alby(str));
            if (a2 == null) {
                albw.m60828a(C0126R.string.panorama_image_doesnt_contain_metadata, this, alaq);
                return;
            }
            File file2 = new File(str);
            if (!file2.exists()) {
                Log.e("PanoramaViewActivity", str.length() == 0 ? new String("Could not load file: ") : "Could not load file: ".concat(str));
                albw.m60828a(C0126R.string.panorama_image_file_could_not_be_read, this, alaq);
                return;
            }
            try {
                alcn = new alcn(new FileInputStream(file2), alau.f73234a);
            } catch (FileNotFoundException e2) {
                Log.e("TileProviderImpl", "File not found", e2);
            }
            alch alch = new alch(this, new alce(alcn, a2));
            this.f81434a = alch;
            if (!this.f81440g) {
                alch.f73405b.f73455p = new alar(this);
            }
            this.f81434a.f73408e = new alas(this);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.addView(this.f81434a);
            alcd alcd = new alcd(this);
            alcd.setOnClickListener(new alat(this));
            this.f81435b = alcd;
            relativeLayout.addView(alcd);
            setContentView(relativeLayout);
            alch alch2 = this.f81434a;
            albp albp2 = this.f81439f;
            albs albs = this.f81438e;
            alcj alcj = alch2.f73405b;
            alcj.f73440a = albp2;
            alcj.f73453n = albs;
            albs.f73360n = new alcg(alch2);
            this.f81435b.mo40110a();
        }
    }

    /* renamed from: a */
    public final void mo45926a(boolean z) {
        int i;
        this.f81434a.f73404a = !z;
        this.f81436c = z;
        alcd alcd = this.f81435b;
        if (!z) {
            i = C0126R.C0127drawable.ic_compass;
        } else {
            i = C0126R.C0127drawable.ic_360pano_view;
        }
        alcd.setImageResource(i);
        if (!this.f81436c) {
            this.f81438e.mo40102a();
            this.f81434a.mo40113a(false);
            return;
        }
        alcj alcj = this.f81434a.f73405b;
        alcj.f73448i = 0.0f;
        alcj.mo40122c();
        alcj.f73442c = false;
        alcj.mo40116a();
        alcj.mo40121b();
        this.f81438e.mo40103a(this);
        this.f81434a.mo40113a(true);
    }
}
