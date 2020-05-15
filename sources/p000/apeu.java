package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.SourceStats;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: apeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apeu extends aaab {

    /* renamed from: a */
    private final aoyh f84260a = aoyh.m69805a("FetchDeviceBackupsOp");

    /* renamed from: b */
    private final apbn f84261b;

    /* renamed from: c */
    private final String f84262c;

    /* renamed from: d */
    private final String f84263d;

    /* renamed from: e */
    private final aoyq f84264e;

    public apeu(apbn apbn, String str, String str2) {
        super(135, "FetchDeviceBackups");
        this.f84261b = apbn;
        this.f84262c = str;
        this.f84263d = str2;
        this.f84264e = new aoyq(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Context context2 = context;
        aoyo aoyo = new aoyo(context2);
        ArrayList arrayList = new ArrayList();
        try {
            apbv apbv = new apbv(context2);
            this.f84264e.mo47010a();
            ClientContext a = apbs.m70036a(context2, this.f84262c);
            String str = this.f84263d;
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
            apbu apbu = apbv.f84113a;
            long b = cgjp.m145738b();
            if (apbu.f84110b == null) {
                apbu.f84110b = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/FetchBackUpDeviceContactInfo", ciie.m150370a(btcv.f148356b), ciie.m150370a(btcw.f148359b));
            }
            this.f84264e.mo47012a(context2, "fetch_backups", true);
            for (btez btez : ((btcw) apbu.f84112a.mo25553a(apbu.f84110b, a, btcv, b, TimeUnit.MILLISECONDS)).f148361a) {
                if (cgkf.m145856c()) {
                    if (cgkf.f187143a.mo6606a().mo83970e()) {
                        btfc btfc = btez.f148602f;
                        if (btfc == null) {
                            btfc = btfc.f148610b;
                        }
                        if (((long) btfc.f148612a) >= cgkf.f187143a.mo6606a().mo83973h()) {
                            aoyh aoyh = this.f84260a;
                            Object[] objArr = new Object[1];
                            btfc btfc2 = btez.f148602f;
                            if (btfc2 == null) {
                                btfc2 = btfc.f148610b;
                            }
                            objArr[0] = Integer.valueOf(btfc2.f148612a);
                            aoyh.mo46979a("Filtered Footprints backup with SDK version: %d", objArr);
                        }
                    }
                }
                apbw apbw = new apbw();
                apbw.f84115a = btez.f148597a;
                apbw.f84118d = btez.f148600d;
                apbw.f84119e = Long.valueOf(btez.f148601e);
                apbw.f84120f = Long.valueOf(apet.m70117a(context).getLong(apet.m70118a(btez.f148597a), 0));
                if (cgkf.m145856c()) {
                    apbw.f84116b = Long.valueOf(btez.f148598b);
                }
                for (btfq btfq : btez.f148599c) {
                    apcf apcf = new apcf();
                    apcf.f84123a = btfq.f148738a;
                    apcf.f84124b = Integer.valueOf(btfq.f148739b);
                    SourceStats[] sourceStatsArr = {new SourceStatsEntity(apcf.f84123a, apcf.f84124b)};
                    if (apbw.f84117c == null) {
                        apbw.f84117c = new ArrayList();
                    }
                    SourceStats sourceStats = sourceStatsArr[0];
                    if (sourceStats != null) {
                        apbw.f84117c.add(sourceStats);
                    }
                }
                BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = new BackedUpContactsPerDeviceEntity(apbw.f84115a, apbw.f84116b, apbw.f84117c, apbw.f84118d, apbw.f84119e, apbw.f84120f, null, true);
                arrayList.add(new BackedUpContactsPerDeviceEntity(backedUpContactsPerDeviceEntity.f107230a, backedUpContactsPerDeviceEntity.f107231b, backedUpContactsPerDeviceEntity.mo58802c(), backedUpContactsPerDeviceEntity.f107232c, backedUpContactsPerDeviceEntity.f107233d, backedUpContactsPerDeviceEntity.f107234e, backedUpContactsPerDeviceEntity.f107235f, false));
            }
            this.f84261b.mo46968b(Status.f30107a, arrayList);
            return;
        } catch (gid e) {
            aoyo.mo47009a(e, cgjy.m145765l());
            this.f84260a.mo46980a(e, "Auth Exception when fetching contacts from server");
            aoyj.m69819a().mo46996a("fetch_backups_error:authentication_failure");
        } catch (chuw e2) {
            chuw chuw = e2;
            aoyo.mo47009a(chuw, cgjy.m145765l());
            this.f84260a.mo46980a(chuw, "Status Exception when fetching contacts from server");
            aoyj a2 = aoyj.m69819a();
            String valueOf = String.valueOf(chuw.f189236a.f189233s);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("fetch_backups_error:status_error:");
            sb.append(valueOf);
            a2.mo46996a(sb.toString());
        } catch (RuntimeException e3) {
            RuntimeException runtimeException = e3;
            aoyo.mo47009a(runtimeException, cgjy.m145766m());
            this.f84260a.mo46980a(runtimeException, "Failed to fetch contacts backup due to runtime exception.");
            aoyj a3 = aoyj.m69819a();
            String valueOf2 = String.valueOf(runtimeException.getMessage());
            a3.mo46996a(valueOf2.length() == 0 ? new String("fetch_backups_error:runtime_error:") : "fetch_backups_error:runtime_error:".concat(valueOf2));
        } catch (Throwable th) {
            Throwable th2 = th;
            mo6503a(Status.f30109c);
            throw th2;
        }
        mo6503a(Status.f30109c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f84261b.mo46968b(status, null);
    }
}
