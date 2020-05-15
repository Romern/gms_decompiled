package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothSocket;
import android.os.Looper;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.io.IOException;
import java.security.SignatureException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* renamed from: juq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class juq extends jum {

    /* renamed from: b */
    private static final Logger f23244b = new Logger("D2D", "BluetoothConnectionCreationTask");

    /* renamed from: a */
    final /* synthetic */ SourceChimeraActivity f23245a;

    /* renamed from: c */
    private final BluetoothAdapter f23246c;

    /* renamed from: d */
    private final UUID f23247d;

    /* renamed from: e */
    private final String f23248e;

    /* renamed from: f */
    private BluetoothSocket f23249f;

    /* renamed from: g */
    private boolean f23250g = false;

    public juq(SourceChimeraActivity sourceChimeraActivity, BluetoothAdapter bluetoothAdapter, UUID uuid, String str) {
        this.f23245a = sourceChimeraActivity;
        sdo.m34959a(bluetoothAdapter);
        this.f23246c = bluetoothAdapter;
        sdo.m34959a(uuid);
        this.f23247d = uuid;
        sdo.m34977c(str);
        this.f23248e = str;
    }

    /* renamed from: a */
    public final void mo14115a() {
        BluetoothSocket bluetoothSocket;
        if (!this.f23250g && (bluetoothSocket = this.f23249f) != null) {
            try {
                bluetoothSocket.close();
            } catch (IOException e) {
                f23244b.mo25410a((Throwable) e);
            }
        }
    }

    public final void run() {
        try {
            this.f23249f = this.f23246c.getRemoteDevice(this.f23248e).createInsecureRfcommSocketToServiceRecord(this.f23247d);
            f23244b.mo25412b("Creating Bluetooth connection....", new Object[0]);
            this.f23249f.connect();
            f23244b.mo25412b("Created Bluetooth connection.", new Object[0]);
            this.f23250g = true;
            mo14116a(new jup(this.f23249f));
        } catch (IOException e) {
            f23244b.mo25415d("Failed to create Bluetooth connection.", e, new Object[0]);
            mo14115a();
            this.f23245a.finish();
        }
    }

    /* renamed from: a */
    public final void mo14116a(jup jup) {
        SourceChimeraActivity.f11265a.mo25412b("Bluetooth connection created.", new Object[0]);
        SourceChimeraActivity sourceChimeraActivity = this.f23245a;
        sourceChimeraActivity.f11280o = jup;
        String name = sourceChimeraActivity.f11268c.getRemoteDevice(sourceChimeraActivity.f11276k.f23255c).getName();
        if (name == null) {
            name = this.f23245a.getString(C0126R.string.auth_d2d_source_unknown_device_name);
        }
        bxvd da = jus.f23257h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        jus.m17350a((jus) da.f164949b);
        SourceChimeraActivity sourceChimeraActivity2 = this.f23245a;
        if (sourceChimeraActivity2.f11269d) {
            if (!sourceChimeraActivity2.f11271f) {
                String string = sourceChimeraActivity2.getString(C0126R.string.auth_d2d_target_wait_progress_message);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                jus jus = (jus) da.f164949b;
                string.getClass();
                jus.f23259a |= 2;
                jus.f23260b = string;
            } else {
                String string2 = sourceChimeraActivity2.getString(C0126R.string.auth_d2d_target_tap_progress_message);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                jus jus2 = (jus) da.f164949b;
                string2.getClass();
                jus2.f23259a |= 2;
                jus2.f23260b = string2;
            }
        } else if (sourceChimeraActivity2.f11270e) {
            String string3 = sourceChimeraActivity2.getString(C0126R.string.auth_d2d_target_unlock_progress_message);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            jus jus3 = (jus) da.f164949b;
            string3.getClass();
            jus3.f23259a |= 2;
            jus3.f23260b = string3;
        } else {
            String string4 = sourceChimeraActivity2.getString(C0126R.string.auth_d2d_target_tap_progress_message);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            jus jus4 = (jus) da.f164949b;
            string4.getClass();
            jus4.f23259a |= 2;
            jus4.f23260b = string4;
        }
        try {
            SourceChimeraActivity sourceChimeraActivity3 = this.f23245a;
            jtx jtx = sourceChimeraActivity3.f11285t;
            sourceChimeraActivity3.f11284s = jua.m17343a(sourceChimeraActivity3.f11280o, new jul(sourceChimeraActivity3, name), this.f23245a.f11276k.f23256d.mo73780k(), (jus) da.mo74062i());
        } catch (SignatureException e) {
            SourceChimeraActivity.f11265a.mo25410a((Throwable) e);
            this.f23245a.finish();
        } catch (byrq e2) {
            SourceChimeraActivity.f11265a.mo25410a((Throwable) e2);
            this.f23245a.finish();
        }
        try {
            if (!((Boolean) this.f23245a.f11277l.get()).booleanValue()) {
                this.f23245a.mo7856d();
                return;
            }
            new adzt(Looper.getMainLooper()).postDelayed(new jui(this.f23245a), gnv.m13578w());
        } catch (InterruptedException | ExecutionException e3) {
            SourceChimeraActivity.f11265a.mo25417e("Exception while waiting for OK.", e3, new Object[0]);
        }
    }
}
