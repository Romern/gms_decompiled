package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.audiomodem.AudioModemBroadcastReceiver;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: gcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gcy implements gby, gep {

    /* renamed from: a */
    public final adzt f17896a;

    /* renamed from: b */
    public final gca f17897b;

    /* renamed from: c */
    public geq f17898c;

    /* renamed from: d */
    public boolean f17899d;

    /* renamed from: e */
    public gem f17900e;

    /* renamed from: f */
    public boolean f17901f;

    /* renamed from: g */
    public final AudioModemBroadcastReceiver f17902g;

    /* renamed from: h */
    private final Context f17903h;

    /* renamed from: i */
    private final gdx f17904i = new gdx();

    /* renamed from: j */
    private final gdx f17905j = new gdx();

    /* renamed from: k */
    private final geu f17906k;

    public gcy(Context context, adzt adzt) {
        this.f17903h = context;
        this.f17896a = adzt;
        gca gca = new gca();
        this.f17897b = gca;
        gca.mo11633a(this);
        this.f17902g = new AudioModemBroadcastReceiver(context, adzt, this);
        this.f17906k = (geu) ahgz.m55754a(context, geu.class);
        gds.m12998a(context);
    }

    /* renamed from: b */
    public final boolean mo11662b() {
        if (!this.f17899d) {
            if (!cfnp.f184595a.mo6606a().mo81694h()) {
                return false;
            }
            try {
                this.f17898c = new geq(this.f17903h, this);
                this.f17899d = true;
            } catch (Exception e) {
                bnsl bnsl = (bnsl) gdv.f17985a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("gcy", "b", 306, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to initialize token encoder");
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m12949a(gez gez, int i) {
        Status status = new Status(i, null, null);
        if (gez == null) {
            srn srn = gdv.f17985a;
            return;
        }
        try {
            gez.mo11755a(status);
            srn srn2 = gdv.f17985a;
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) gdv.f17985a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("gcy", "a", 357, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to send callback message");
        }
    }

    /* renamed from: a */
    public static void m12950a(gez gez, int i, PendingIntent pendingIntent) {
        Status status = new Status(i, null, pendingIntent);
        if (gez == null) {
            srn srn = gdv.f17985a;
            return;
        }
        try {
            gez.mo11755a(status);
            srn srn2 = gdv.f17985a;
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) gdv.f17985a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("gcy", "a", 357, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to send callback message");
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m12951a(gfg gfg) {
        try {
            gfg.mo11764a();
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) gdv.f17985a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("gcy", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Couldn't close audio stream");
        }
    }

    /* renamed from: a */
    public final void mo11656a(gcv gcv, Set set) {
        gdw a = this.f17904i.mo11716a(gcv, set);
        Iterator it = a.f17986a.iterator();
        while (true) {
            char c = 1;
            if (!it.hasNext()) {
                break;
            }
            geo geo = (geo) it.next();
            this.f17906k.mo11753a(gcv.f17981e, 2, geo);
            geq geq = this.f17898c;
            int i = geo.f18060b.f9882a;
            gdl gdl = geq.f18066b;
            geo[] geoArr = gdl.f17959a;
            geo geo2 = geoArr[i];
            if (geo2 == null) {
                geoArr[i] = geo;
                c = 0;
            } else if (!geo2.equals(geo) && !gdl.f17960b[i].contains(geo)) {
                gdl.f17960b[i].add(geo);
                c = 2;
            }
            if (c == 0) {
                geq.mo11743b(i);
            } else if (c == 2) {
                geo.f18059a.mo11654a(2);
            }
        }
        for (geo geo3 : a.f17987b) {
            this.f17906k.mo11753a(gcv.f17981e, 3, geo3);
            geq geq2 = this.f17898c;
            geo3.f18064f = 1;
            int i2 = geo3.f18060b.f9882a;
            if (geo3.equals(geq2.f18066b.mo11686a(i2))) {
                geq2.f18065a.mo11674b(i2);
            } else {
                geq2.f18066b.mo11685a(i2, geo3);
            }
        }
    }

    /* renamed from: a */
    public final void mo11657a(gcw gcw, Set set) {
        gdw a = this.f17905j.mo11716a(gcw, set);
        for (gek gek : a.f17986a) {
            this.f17906k.mo11752a(gcw.f17981e, 5, gek);
            gem gem = this.f17900e;
            if (gem.f18052c) {
                gem.mo11738b();
            }
            gej a2 = gem.mo11736a(gek.f18047b);
            if (a2.f18030a.mo11790a(gek.f18046a)) {
                gek.f18046a.mo11655a(0);
                gem.f18051b.mo11642a(a2);
            }
        }
        for (gek gek2 : a.f17987b) {
            this.f17906k.mo11752a(gcw.f17981e, 6, gek2);
            gem gem2 = this.f17900e;
            Encoding encoding = gek2.f18047b;
            if (gem2.f18050a.containsKey(encoding)) {
                gej gej = (gej) gem2.f18050a.get(encoding);
                if (gej.f18030a.mo11791b(gek2.f18046a)) {
                    gek2.f18046a.mo11655a(1);
                    if (gej.f18030a.mo11789a()) {
                        gem2.f18050a.remove(encoding);
                        gem2.f18051b.mo11644b(gej);
                        gej.mo11731c();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11627a(gdt gdt) {
        if (this.f17896a.getLooper().getThread().isAlive()) {
            this.f17896a.post(new gcu(this, gdt));
        }
    }

    /* renamed from: a */
    public final void mo11658a(geo geo) {
        gcv gcv = geo.f18059a;
        this.f17906k.mo11753a(gcv.f17981e, 4, geo);
        gdx gdx = this.f17904i;
        if (gdx.f17988a.containsKey(gcv) && ((Set) gdx.f17988a.get(gcv)).remove(geo) && ((Set) gdx.f17988a.get(gcv)).isEmpty()) {
            gdx.f17988a.remove(gcv);
            this.f17897b.mo11634a(gcv);
        }
    }

    /* renamed from: a */
    public final void mo11659a(gfj gfj, String str, gez gez) {
        if (!mo11662b()) {
            m12949a(gez, 6501);
            return;
        }
        gcv gcv = new gcv(gfj, str);
        mo11656a(gcv, new HashSet());
        this.f17897b.mo11634a(gcv);
        m12949a(gez, 0);
    }

    /* renamed from: a */
    public final void mo11660a(gfm gfm, String str, gez gez) {
        if (!mo11661a()) {
            m12949a(gez, 6500);
            return;
        }
        gcw gcw = new gcw(gfm, str);
        mo11657a(gcw, new HashSet());
        this.f17897b.mo11634a(gcw);
        m12949a(gez, 0);
    }

    /* renamed from: a */
    public final boolean mo11661a() {
        if (!this.f17901f) {
            if (!cfnp.f184595a.mo6606a().mo81695i()) {
                return false;
            }
            try {
                this.f17900e = new gem(this.f17903h);
                this.f17901f = true;
                AudioModemBroadcastReceiver audioModemBroadcastReceiver = this.f17902g;
                if (!audioModemBroadcastReceiver.f9850c) {
                    Context context = audioModemBroadcastReceiver.f9848a;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
                    context.registerReceiver(audioModemBroadcastReceiver, intentFilter, null, audioModemBroadcastReceiver.f9849b);
                    audioModemBroadcastReceiver.f9850c = true;
                }
            } catch (Exception e) {
                bnsl bnsl = (bnsl) gdv.f17985a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("gcy", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to initialize token decoder");
                return false;
            }
        }
        return true;
    }
}
