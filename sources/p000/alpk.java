package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDevice;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponse;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import com.google.android.gms.people.protomodel.SourceStats;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: alpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpk extends alna {

    /* renamed from: c */
    private final String f74014c;

    /* renamed from: d */
    private final String f74015d;

    /* renamed from: e */
    private final ande f74016e;

    /* renamed from: f */
    private final alms f74017f;

    /* renamed from: g */
    private final almn f74018g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alpk(alzm alzm, String str, int i, String str2, String str3) {
        super(str, i, alzm, str2, "FetchBackUpDeviceContactInfoOperation");
        alms alms = alms.f73790a;
        ande ande = ande.f76660a;
        almn almn = new almn(bmza.m108657a(bmvy.f131119a));
        this.f74015d = str2;
        this.f74014c = str3;
        this.f74017f = alms;
        this.f74016e = ande;
        this.f74018g = almn;
    }

    /* renamed from: c */
    public final Pair mo40604c(Context context) {
        Context context2 = context;
        andd a = this.f74016e.mo41719a(context2);
        ampm a2 = this.f74017f.mo40538a(context2, 14081);
        try {
            this.f74018g.mo40526a();
            ClientContext a3 = amqt.m63194a(context2, this.f74015d);
            String str = this.f74014c;
            try {
                bxvd da = btcv.f148356b.mo74144da();
                bxvd da2 = btcs.f148310b.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str.getClass();
                ((btcs) da2.f164949b).f148312a = str;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btcs btcs = (btcs) da2.mo74062i();
                btcs.getClass();
                ((btcv) da.f164949b).f148358a = btcs;
                btcv btcv = (btcv) da.mo74062i();
                ampl ampl = a2.f75684b;
                amig.m62939a();
                long longValue = ((Long) amfk.f74861a.mo41191a()).longValue();
                if (ampl.f75678m == null) {
                    ampl.f75678m = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/FetchBackUpDeviceContactInfo", ciie.m150370a(btcv.f148356b), ciie.m150370a(btcw.f148359b));
                }
                btcw btcw = (btcw) ampl.f75682a.mo25553a(ampl.f75678m, a3, btcv, longValue, TimeUnit.MILLISECONDS);
                this.f74018g.mo40527a(context2, "fetch_backups", true);
                amot amot = new amot();
                for (btez btez : btcw.f148361a) {
                    amom amom = new amom();
                    amom.f75629a = btez.f148597a;
                    amom.f75631c = btez.f148600d;
                    amom.f75632d = Long.valueOf(btez.f148601e);
                    amom.f75633e = Long.valueOf(alpi.m61467a(context).getLong(alpi.m61468a(btez.f148597a), 0));
                    for (btfq btfq : btez.f148599c) {
                        ampf ampf = new ampf();
                        ampf.f75657a = btfq.f148738a;
                        ampf.f75658b = Integer.valueOf(btfq.f148739b);
                        SourceStats[] sourceStatsArr = {new SourceStatsEntity(ampf.f75657a, ampf.f75658b)};
                        if (amom.f75630b == null) {
                            amom.f75630b = new ArrayList();
                        }
                        SourceStats sourceStats = sourceStatsArr[0];
                        if (sourceStats != null) {
                            amom.f75630b.add(sourceStats);
                        }
                    }
                    BackedUpContactsPerDevice[] backedUpContactsPerDeviceArr = {new BackedUpContactsPerDeviceEntity(amom.f75629a, amom.f75630b, amom.f75631c, amom.f75632d, amom.f75633e)};
                    if (amot.f75638a == null) {
                        amot.f75638a = new ArrayList();
                    }
                    BackedUpContactsPerDevice backedUpContactsPerDevice = backedUpContactsPerDeviceArr[0];
                    if (backedUpContactsPerDevice != null) {
                        amot.f75638a.add(backedUpContactsPerDevice);
                    }
                }
                Bundle bundle = new Bundle(FetchBackUpDeviceContactInfoResponse.class.getClassLoader());
                bundle.putParcelable("people_restore_fetch_info", new FetchBackUpDeviceContactInfoResponseEntity(amot.f75638a, null));
                return new Pair(amqv.f75777c, bundle);
            } catch (gid e) {
                e = e;
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                throw e;
            } catch (chuw e2) {
                e = e2;
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                throw e;
            }
        } catch (gid e3) {
            amig.m62939a();
            a.mo41718a(e3, ((Double) amht.f74922a.mo41191a()).doubleValue());
            Log.e("PeopleRestore", "Auth exception when fetching info from server.", e3);
            return new Pair(amqv.f75779e, null);
        } catch (chuw e4) {
            amig.m62939a();
            a.mo41718a(e4, ((Double) amht.f74922a.mo41191a()).doubleValue());
            Log.e("PeopleRestore", "Operation exception when loading info from server.", e4);
            return new Pair(amqv.f75779e, null);
        }
    }
}
