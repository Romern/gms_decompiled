package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: aydn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aydn implements ayjm, ayjh {

    /* renamed from: k */
    private static final long f97219k = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    public final Context f97220a;

    /* renamed from: b */
    public final ayfn f97221b;

    /* renamed from: c */
    public final axwi f97222c;

    /* renamed from: d */
    public final Handler f97223d;

    /* renamed from: e */
    public final Object f97224e = new Object();

    /* renamed from: f */
    public aycm f97225f;

    /* renamed from: g */
    public aycs f97226g;

    /* renamed from: h */
    aybl f97227h;

    /* renamed from: i */
    public ayds f97228i;

    /* renamed from: j */
    public Boolean f97229j;

    /* renamed from: l */
    private final SharedPreferences f97230l;

    /* renamed from: m */
    private final ayaw f97231m;

    public aydn(Context context, SharedPreferences sharedPreferences, ayfn ayfn, ayaw ayaw, axwi axwi) {
        this.f97220a = context;
        this.f97221b = ayfn;
        this.f97230l = sharedPreferences;
        this.f97231m = ayaw;
        this.f97222c = axwi;
        this.f97223d = new adzt(context.getMainLooper());
        if (this.f97221b.mo53980a().size() <= 0) {
            SharedPreferences sharedPreferences2 = this.f97230l;
            ConnectionConfiguration connectionConfiguration = new ConnectionConfiguration(sharedPreferences2.getString("paired_bt_name", null), sharedPreferences2.getString("paired_bt_address", null), sharedPreferences2.getInt("connection_type", 0), sharedPreferences2.getInt("side", 0), sharedPreferences2.getBoolean("connection_desired", false));
            if (connectionConfiguration.f110866c != 0) {
                this.f97221b.mo53981a(connectionConfiguration);
            }
        }
        synchronized (this.f97224e) {
            mo53956c();
        }
    }

    /* renamed from: h */
    private final void m83841h(ConnectionConfiguration connectionConfiguration) {
        String str;
        Iterator it = this.f97231m.f96992e.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            ConnectionConfiguration connectionConfiguration2 = (ConnectionConfiguration) it.next();
            if (connectionConfiguration2.equals(connectionConfiguration)) {
                str = connectionConfiguration2.f110870g;
                break;
            }
        }
        if (str != null) {
            connectionConfiguration.mo60244a(str);
            ayfn ayfn = this.f97221b;
            String str2 = connectionConfiguration.f110864a;
            if (str2 != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("nodeId", str);
                ayfn.f97489a.getWritableDatabase().updateWithOnConflict("connectionConfigurations", contentValues, "name=?", new String[]{str2}, 5);
                return;
            }
            return;
        }
        connectionConfiguration.mo60244a(null);
    }

    /* renamed from: a */
    public final void mo53580a() {
        SQLiteDatabase writableDatabase = this.f97221b.f97489a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("connectionConfigurations", null, null);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: b */
    public final void mo53954b(ConnectionConfiguration connectionConfiguration) {
        String str;
        ConnectionConfiguration connectionConfiguration2 = connectionConfiguration;
        aybl aybl = this.f97227h;
        if (aybl == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) this.f97220a.getSystemService(BluetoothManager.class);
            BluetoothAdapter adapter = bluetoothManager.getAdapter();
            aybz aybz = new aybz(this.f97220a, bluetoothManager, new ReentrantLock(true), Long.valueOf(f97219k));
            HandlerThread handlerThread = new HandlerThread("BleConnectionManager");
            new skc(this.f97220a);
            handlerThread.start();
            Context context = this.f97220a;
            aybv aybv = new aybv(bluetoothManager, new asfb(context, 1, "BleScanHelper", null, "com.google.android.wearable.app"));
            handlerThread.getLooper();
            new aycd();
            Context context2 = this.f97220a;
            Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            handlerThread.getLooper();
            aycf aycf = new aycf(context2);
            ContentResolver contentResolver = this.f97220a.getContentResolver();
            handlerThread.getLooper();
            aybu aybu = new aybu(context, adapter, aybv, aybz, aycf, new ayce(contentResolver), handlerThread.getLooper(), connectionConfiguration);
            this.f97227h = aybu;
            ayck ayck = aybu.f97141B;
            if (ayck != null) {
                ayck.mo33957d(ayck.obtainMessage(-2, ayck.f97128f));
                return;
            }
            return;
        }
        if (!connectionConfiguration2.f110868e) {
            str = "disabled";
        } else {
            str = "enabled";
        }
        aybu aybu2 = (aybu) aybl;
        aybu2.mo53866a(str.length() == 0 ? new String("updateConfiguration: config is ") : "updateConfiguration: config is ".concat(str));
        aybu2.f97057g.set(connectionConfiguration2);
        ((aycl) aybl).mo53895b(3);
    }

    /* renamed from: c */
    public final void mo53956c() {
        this.f97223d.post(new aycz(this));
        List a = this.f97221b.mo53980a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            mo53952a((ConnectionConfiguration) a.get(i));
        }
    }

    /* renamed from: c */
    public final boolean mo53957c(ConnectionConfiguration connectionConfiguration) {
        return connectionConfiguration.f110866c == 1 && connectionConfiguration.f110867d == 1;
    }

    /* renamed from: d */
    public final boolean mo53958d(ConnectionConfiguration connectionConfiguration) {
        return connectionConfiguration.f110866c == 1 && connectionConfiguration.f110867d == 2;
    }

    /* renamed from: e */
    public final boolean mo53959e(ConnectionConfiguration connectionConfiguration) {
        return connectionConfiguration.f110866c == 2;
    }

    /* renamed from: f */
    public final boolean mo53960f(ConnectionConfiguration connectionConfiguration) {
        return connectionConfiguration.f110866c == 3;
    }

    /* renamed from: g */
    public final ConnectionConfiguration mo53961g(ConnectionConfiguration connectionConfiguration) {
        if (connectionConfiguration.f110864a != null) {
            return connectionConfiguration;
        }
        if (connectionConfiguration.f110867d == 2) {
            Log.d("Wear_ConnectionMgr", "adding a name to a ROLE_SERVER config that has no name");
            return new ConnectionConfiguration("server", connectionConfiguration.f110865b, connectionConfiguration.f110866c, connectionConfiguration.f110867d, connectionConfiguration.f110868e, connectionConfiguration.f110872i);
        } else if (connectionConfiguration.f110866c != 2) {
            return connectionConfiguration;
        } else {
            Log.d("Wear_ConnectionMgr", "adding a name to a CONNECTION_TYPE_NETWORK config that has no name");
            return new ConnectionConfiguration("network", connectionConfiguration.f110865b, connectionConfiguration.f110866c, connectionConfiguration.f110867d, connectionConfiguration.f110868e, connectionConfiguration.f110872i);
        }
    }

    /* renamed from: a */
    public final void mo53952a(ConnectionConfiguration connectionConfiguration) {
        if (!connectionConfiguration.mo60246b() || !connectionConfiguration.f110868e) {
            String valueOf = String.valueOf(connectionConfiguration);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
            sb.append("Attempt to start an invalid or already started config: ");
            sb.append(valueOf);
            Log.w("Wear_ConnectionMgr", sb.toString());
        } else if (mo53957c(connectionConfiguration)) {
            this.f97223d.post(new ayda(this, connectionConfiguration));
        } else if (mo53958d(connectionConfiguration)) {
            this.f97223d.post(new aydb(this, connectionConfiguration));
        } else if (mo53959e(connectionConfiguration)) {
            this.f97223d.post(new aydc(this, connectionConfiguration));
        } else if (mo53960f(connectionConfiguration)) {
            this.f97223d.post(new aydd(this, connectionConfiguration));
        }
    }

    /* renamed from: b */
    public final ConnectionConfiguration[] mo53955b() {
        List a = this.f97221b.mo53980a();
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) a.get(i);
            if (connectionConfiguration.f110866c != 4) {
                arrayList.add(connectionConfiguration);
            }
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m83841h((ConnectionConfiguration) arrayList.get(i2));
        }
        return (ConnectionConfiguration[]) arrayList.toArray(new ConnectionConfiguration[arrayList.size()]);
    }

    /* renamed from: a */
    public final void mo53953a(String str, boolean z) {
        if (this.f97221b.mo53979a(str) == null) {
            if (Log.isLoggable("Wear_ConnectionMgr", 3)) {
                Log.d("Wear_ConnectionMgr", "setConnectionEnabled did not find a config to update.");
            }
            throw new IllegalArgumentException("the config with the given name doesn't exist");
        }
        ayfn ayfn = this.f97221b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("connectionEnabled", Boolean.valueOf(z));
        ayfn.f97489a.getWritableDatabase().updateWithOnConflict("connectionConfigurations", contentValues, "name=?", new String[]{str == null ? "NULL_STRING" : str}, 5);
        ConnectionConfiguration a = this.f97221b.mo53979a(str);
        if (a.f110866c == 4) {
            return;
        }
        if (!mo53957c(a)) {
            if (!mo53958d(a)) {
                if (!mo53959e(a)) {
                    if (mo53960f(a)) {
                        this.f97223d.post(new aycy(this, a));
                    }
                } else if (!z) {
                    this.f97223d.post(new aycx(this));
                } else {
                    this.f97223d.post(new aydm(this, a));
                }
            } else if (!z) {
                this.f97223d.post(new aydl(this, a));
            } else {
                this.f97223d.post(new aydk(this, a));
            }
        } else if (!z) {
            this.f97223d.post(new aydj(this, a));
        } else {
            this.f97223d.post(new aydi(this, a));
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        ssb.mo26034a();
        ConnectionConfiguration[] b = mo53955b();
        int length = b.length;
        int i = 0;
        for (ConnectionConfiguration connectionConfiguration : b) {
            if (connectionConfiguration.f110869f) {
                i++;
            }
        }
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(length));
        String valueOf = String.valueOf(pair.first);
        String valueOf2 = String.valueOf(pair.second);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" connected out of ");
        sb.append(valueOf2);
        ssb.println(sb.toString());
        ssb.println("======");
        ssb.println("Connection Configurations: ");
        ssb.mo26034a();
        List a = this.f97221b.mo53980a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConnectionConfiguration connectionConfiguration2 = (ConnectionConfiguration) a.get(i2);
            m83841h(connectionConfiguration2);
            String valueOf3 = String.valueOf(connectionConfiguration2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 8);
            sb2.append("Config: ");
            sb2.append(valueOf3);
            ssb.println(sb2.toString());
        }
        ssb.mo26035b();
        ssb.println("======");
        ssb.mo26035b();
        aycm aycm = this.f97225f;
        if (aycm != null) {
            aycm.mo53558a(ssb, z, z2);
        }
        aycs aycs = this.f97226g;
        if (aycs != null) {
            aycs.mo53558a(ssb, z, z2);
        }
        aybl aybl = this.f97227h;
        if (aybl != null) {
            aybl.mo53558a(ssb, z, z2);
        }
    }
}
