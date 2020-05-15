package p000;

import android.database.Cursor;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aybo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aybo extends aycg {

    /* renamed from: a */
    final /* synthetic */ aybu f97032a;

    public aybo(aybu aybu) {
        this.f97032a = aybu;
    }

    /* renamed from: a */
    public final void mo53860a() {
        this.f97032a.mo53895b(1);
    }

    /* renamed from: c */
    public final String mo53863c() {
        return "ConnectingState";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11.close();
     */
    /* renamed from: a */
    public final boolean mo53861a(Message message) {
        Cursor query;
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = aybu.f97038z;
                if (!aybu.m83773e()) {
                    this.f97032a.f97056f.mo53878b();
                }
                if (aybu.m83773e()) {
                    this.f97032a.mo53866a("onServiceChanged() Connection Model enabled, transitioning to Connected State.");
                    aybu aybu = this.f97032a;
                    aybu.mo53896b(aybu.f97073w);
                }
            } catch (aybx e) {
                this.f97032a.mo53865a(e);
                aybu aybu2 = this.f97032a;
                aybu2.mo53896b(aybu2.f97074x);
            }
        } else if (i != 2) {
            if (i != 3) {
                if (i != 10) {
                    return this.f97032a.mo53867a(message);
                }
                if (aybu.m83773e()) {
                    Log.e("BleConnectionManager", "Unexpected Services Discovered in Connecting w/ OnServiceChangedModel. Disconnecting.");
                    aybu aybu3 = this.f97032a;
                    aybu3.mo53896b(aybu3.f97074x);
                } else {
                    aycf aycf = this.f97032a.f97055e;
                    Cursor query2 = aycf.f97108a.getContentResolver().query(aycc.f97104g, null, null, null, null);
                    if (query2 != null) {
                        while (true) {
                            try {
                                if (query2.moveToNext()) {
                                    if ("clockwork_auto_time".equals(query2.getString(0))) {
                                        query2.getInt(1);
                                        break;
                                    }
                                }
                            } catch (aybx e2) {
                                this.f97032a.mo53866a("Failed to update current time");
                                this.f97032a.mo53865a(e2);
                            } catch (Throwable th) {
                                query2.close();
                                throw th;
                            }
                        }
                    }
                    query = aycf.f97108a.getContentResolver().query(aycc.f97105h, null, null, null, null);
                    if (query != null) {
                        while (true) {
                            if (query.moveToNext()) {
                                if ("clockwork_auto_time_zone".equals(query.getString(0))) {
                                    query.getInt(1);
                                    break;
                                }
                            }
                        }
                    }
                    this.f97032a.mo53866a("Companion app reset connection after service changed, returning.");
                    if (!aybu.m83773e()) {
                        Log.w("BleConnectionManager", "Failed to setup Companion app connection. Disconnecting.");
                        aybu aybu4 = this.f97032a;
                        aybu4.mo53896b(aybu4.f97074x);
                    } else {
                        aybu aybu5 = this.f97032a;
                        aybu5.mo53896b(aybu5.f97073w);
                    }
                }
            } else if (!((ConnectionConfiguration) this.f97032a.f97057g.get()).f110868e) {
                aybu aybu6 = this.f97032a;
                aybu6.mo53896b(aybu6.f97074x);
            }
        } else if (message.arg1 == 10) {
            aybu aybu7 = this.f97032a;
            aybu7.mo53896b(aybu7.f97074x);
        }
        return true;
    }
}
