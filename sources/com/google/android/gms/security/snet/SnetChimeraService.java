package com.google.android.gms.security.snet;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnetChimeraService extends Service {

    /* renamed from: j */
    private static final String f107560j = SnetChimeraService.class.getSimpleName();

    /* renamed from: a */
    boolean f107561a = false;

    /* renamed from: b */
    public apyy f107562b;

    /* renamed from: c */
    public apgy f107563c;

    /* renamed from: d */
    public int f107564d;

    /* renamed from: e */
    public aqdu f107565e;

    /* renamed from: f */
    public String f107566f;

    /* renamed from: g */
    ExecutorService f107567g;

    /* renamed from: h */
    public String f107568h;

    /* renamed from: i */
    public Bundle f107569i;

    /* renamed from: a */
    public static Bundle m92421a(File file) {
        JsonReader jsonReader = new JsonReader(new BufferedReader(new InputStreamReader(new FileInputStream(file), "US-ASCII")));
        Bundle bundle = new Bundle();
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("url".equals(nextName)) {
                    bundle.putString(nextName, jsonReader.nextString());
                } else if (!"percent".equals(nextName)) {
                    bundle.putString(nextName, jsonReader.nextString());
                } else {
                    bundle.putInt(nextName, jsonReader.nextInt());
                }
            }
            jsonReader.endObject();
            return bundle;
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: a */
    public final void mo58941a(int i) {
        this.f107565e.f85802p = i;
    }

    /* renamed from: b */
    public final void mo58943b() {
        if (this.f107569i == null) {
            File file = new File(this.f107562b.f85201b, "installed/snet_flags");
            apyy apyy = this.f107562b;
            if (apyy.mo47715b(new File(apyy.f85201b, "installed/metadata_flags"), file)) {
                this.f107569i = m92421a(file);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        int i;
        super.onCreate();
        this.f107567g = snp.m35704b(10);
        try {
            i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            i = -1;
        }
        this.f107564d = i;
        this.f107563c = new apgy(this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!this.f107561a) {
            try {
                this.f107561a = true;
                String action = intent.getAction();
                if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(action)) {
                    this.f107567g.execute(new aqdr(this));
                } else if (!"com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(action)) {
                    Log.e(f107560j, "snet unknown action.");
                    mo58942a(false);
                } else {
                    this.f107567g.execute(new aqds(this));
                }
            } catch (Throwable th) {
                if (this.f107565e != null) {
                    aqdu.m71410a(th);
                }
                mo58942a(false);
            }
            return 2;
        }
        Log.e(f107560j, "snet re-entered.");
        return 2;
    }

    /* renamed from: a */
    public final void mo58940a() {
        this.f107562b = new apyy(this, this.f107564d);
        this.f107565e = new aqdu(this, this.f107562b, this.f107564d);
        String uuid = UUID.randomUUID().toString();
        this.f107566f = uuid;
        this.f107565e.f85799m = uuid;
        this.f107568h = "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
        if (!apzc.m71214b(this)) {
            this.f107568h = apzc.m71215c(this);
        }
        if (TextUtils.isEmpty(this.f107568h) || "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa".equals(this.f107568h)) {
            this.f107568h = apzc.m71216d(this);
        }
        this.f107565e.f85800n = this.f107568h;
    }

    /* renamed from: a */
    public final void mo58942a(boolean z) {
        if (z) {
            try {
                if (this.f107565e != null) {
                    aqdu.f85791g = apgy.m70270b(this);
                    aqdu.f85790f = this.f107563c.mo47203b();
                    this.f107565e.mo47765a(2);
                }
            } catch (Throwable th) {
                this.f107561a = false;
                stopSelf();
                throw th;
            }
        }
        this.f107561a = false;
        stopSelf();
    }
}
