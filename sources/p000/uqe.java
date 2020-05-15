package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uqe {

    /* renamed from: a */
    public static final sbw f48514a = new sbw("EventDistributor", "");

    /* renamed from: b */
    public final uqu f48515b;

    /* renamed from: c */
    public final ubf f48516c;

    /* renamed from: d */
    public final uql f48517d;

    /* renamed from: e */
    public final long f48518e = ((Long) twy.f46855am.mo58455c()).longValue();

    /* renamed from: f */
    public final int f48519f = ((Integer) twy.f46856an.mo58455c()).intValue();

    /* renamed from: g */
    public final uhn f48520g;

    /* renamed from: h */
    public final Executor f48521h = snp.m35704b(9);

    /* renamed from: i */
    public final veg f48522i;

    /* renamed from: j */
    private final Context f48523j;

    /* renamed from: k */
    private final uqp f48524k;

    /* renamed from: l */
    private final uff f48525l;

    /* renamed from: m */
    private final long f48526m = ((Long) twy.f46854al.mo58455c()).longValue();

    /* renamed from: n */
    private final int f48527n = ((Integer) twy.f46853ak.mo58455c()).intValue();

    /* renamed from: o */
    private final vcz f48528o;

    /* renamed from: p */
    private final uqh f48529p;

    /* renamed from: q */
    private final vpn f48530q = new vpn(new uqb(this), this.f48518e, this.f48521h, "EventDistributor");

    public uqe(Context context, uqu uqu, ubf ubf, uql uql, uqh uqh, uqp uqp, uff uff, sqv sqv, veg veg, vcz vcz, uhn uhn) {
        sdo.m34959a(context);
        this.f48523j = context;
        sdo.m34959a(uqu);
        this.f48515b = uqu;
        sdo.m34959a(ubf);
        this.f48516c = ubf;
        sdo.m34959a(uqh);
        this.f48529p = uqh;
        sdo.m34959a(uql);
        this.f48517d = uql;
        sdo.m34959a(uqp);
        this.f48524k = uqp;
        sdo.m34959a(sqv);
        sdo.m34959a(uff);
        this.f48525l = uff;
        sdo.m34959a(veg);
        this.f48522i = veg;
        sdo.m34959a(vcz);
        this.f48528o = vcz;
        sdo.m34959a(uhn);
        this.f48520g = uhn;
    }

    /* renamed from: a */
    private final ParcelFileDescriptor m39223a(String str) {
        if (str != null) {
            return this.f48525l.mo27279a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo27856a() {
        this.f48530q.mo28726a();
    }

    /* renamed from: a */
    public final void mo27857a(DriveId driveId) {
        mo27859a(bnic.m109489a(driveId));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.util.Collection], assign insn: 0x0054: INVOKE  (r1v2 ? I:java.util.Collection) = (r1v1 ubf) type: VIRTUAL call: ubf.a():java.util.Collection */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.util.Collection], assign insn: 0x001f: INVOKE  (r1v4 ? I:java.util.Collection) = (r1v3 ubf) type: VIRTUAL call: ubf.a():java.util.Collection */
    /* renamed from: a */
    public final void mo27858a(TransferProgressData transferProgressData, ujx ujx) {
        boolean a = this.f48529p.mo27866a(transferProgressData);
        int i = transferProgressData.f30791a;
        int i2 = 0;
        if (i == 0) {
            ubf ubf = this.f48516c;
            TransferProgressEvent transferProgressEvent = new TransferProgressEvent(transferProgressData);
            ? a2 = ubf.mo27068a();
            int size = a2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ubk ubk = ((ubn) a2.get(i3)).f47170d;
                if (ujx.mo27564a(ubk.f47143d)) {
                    ubk.f47151l.mo27813a(transferProgressEvent, ujx.mo27610g());
                }
            }
            if (a) {
                this.f48515b.mo27889a(transferProgressData);
            }
        } else if (i != 1) {
            f48514a.mo25377c("EventDistributor", "Unexpected transfer type");
        } else {
            ubf ubf2 = this.f48516c;
            TransferProgressEvent transferProgressEvent2 = new TransferProgressEvent(transferProgressData);
            ? a3 = ubf2.mo27068a();
            int size2 = a3.size();
            for (i2++; i2 < size2; i2++) {
                ubk ubk2 = ((ubn) a3.get(i2)).f47170d;
                if (ujx.mo27564a(ubk2.f47143d)) {
                    ubk2.f47151l.mo27822b(transferProgressEvent2, ujx.mo27610g());
                }
            }
            if (a) {
                this.f48515b.mo27889a(transferProgressData);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.util.Collection], assign insn: 0x0002: INVOKE  (r1v0 ? I:java.util.Collection) = (r0v0 ubf) type: VIRTUAL call: ubf.a():java.util.Collection */
    /* renamed from: a */
    public final void mo27859a(Set set) {
        ubf ubf = this.f48516c;
        ? a = ubf.mo27068a();
        int size = a.size();
        int i = 0;
        while (i < size) {
            ubk ubk = ((ubn) a.get(i)).f47170d;
            ubf.f47119b.mo27435d();
            try {
                ubk.f47151l.mo27815a(set);
                ubf.f47119b.mo27442f();
                ubf.f47119b.mo27439e();
                i++;
            } catch (Throwable th) {
                ubf.f47119b.mo27439e();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo27860a(umd umd) {
        MetadataBundle metadataBundle;
        ArrayList arrayList;
        String str;
        Cursor a;
        uin uin;
        umd umd2 = umd;
        if (umd2.f48366m >= 0) {
            try {
                sdo.m34959a(umd);
                vpu a2 = vpu.m41034a();
                JSONObject jSONObject = new JSONObject(umd2.f48195c);
                uhn uhn = a2.f49757d;
                uey g = uhn.mo27444g(umd2.f48194b);
                if (g != null) {
                    DriveId g2 = uhn.mo27402a(g, umd2.f48193a).mo27610g();
                    if (jSONObject.has("modifiedMetadata")) {
                        metadataBundle = uyj.m39759a(jSONObject.getJSONObject("modifiedMetadata"));
                    } else {
                        metadataBundle = null;
                    }
                    JSONArray jSONArray = jSONObject.getJSONArray("trackingTags");
                    ArrayList arrayList2 = new ArrayList(jSONArray.length());
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList2.add(jSONArray.getString(i));
                    }
                    if (jSONObject.has("actionTypes")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("actionTypes");
                        ArrayList arrayList3 = new ArrayList(jSONArray2.length());
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            arrayList3.add(txr.m37691a(jSONArray2.getString(i2)));
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = new ArrayList();
                    }
                    upx upx = new upx(g2, vpd.m40996a(jSONObject, "accountName"), jSONObject.optString("resolvedAccountName", "__unknown_account_name"), vpd.m40996a(jSONObject, "baseContentHash"), vpd.m40996a(jSONObject, "modifiedContentHash"), metadataBundle, arrayList2, arrayList, jSONObject.getInt("status"), vpd.m40996a(jSONObject, "overrideServicePackageName"));
                    int i3 = umd2.f48197e;
                    if (i3 < this.f48527n) {
                        uts uts = new uts(this, umd2, upx);
                        String str2 = upx.f48508j;
                        if (str2 != null) {
                            str = str2;
                        } else {
                            uhn uhn2 = this.f48520g;
                            long j = umd2.f48194b;
                            uhj uhj = ((ugx) uhn2).f47578a;
                            a = uhj.mo27468a(uiq.f47724a.mo27735b(), (String[]) null, uiq.f47724a.f48341a.mo27717e(j), (String) null);
                            if (a.moveToFirst()) {
                                uin = uin.m38683a(uhj, a);
                                a.close();
                            } else {
                                a.close();
                                uin = null;
                            }
                            if (uin != null) {
                                str = uin.f47709b.f30764b;
                            } else {
                                f48514a.mo25377c("EventDistributor", "Unable to find executing app for persisted event.");
                                mo27861a(umd2, null, 2);
                                return;
                            }
                        }
                        CompletionEvent completionEvent = new CompletionEvent(upx.f48499a, upx.f48500b, m39223a(upx.f48502d), m39223a(upx.f48503e), upx.f48504f, this.f48523j, upx.f48505g, upx.f48507i, uts);
                        f48514a.mo25369a("Routing CompletionEvent: %s. To: %s", completionEvent, str);
                        this.f48524k.mo27884a(str, completionEvent);
                        umd2.f48197e = i3 + 1;
                        umd2.f48196d = System.currentTimeMillis() + this.f48526m;
                        umd.mo27725t();
                        return;
                    }
                    mo27861a(umd2, upx, 1);
                    return;
                }
                throw new tzu(null);
            } catch (IOException | JSONException | tzu | uaa e) {
                f48514a.mo25378c("EventDistributor", String.format("%s extracting completion event from persisted event", e.getClass().getSimpleName()), e);
                mo27861a(umd2, null, 2);
            } catch (SQLException e2) {
                f48514a.mo25378c("EventDistributor", "SQLException increasing persisted event attempts", e2);
                mo27861a(umd2, null, 2);
            } catch (Throwable th) {
                Throwable th2 = th;
                a.close();
                throw th2;
            }
        } else {
            f48514a.mo25377c("EventDistributor", "Event to raise is not persisted yet");
        }
    }

    /* renamed from: a */
    public final void mo27861a(umd umd, upx upx, int i) {
        long j = umd.f48366m;
        if (j >= 0) {
            int i2 = umd.f48198f;
            vcy c = this.f48528o.mo28312c();
            c.mo28309j();
            c.mo28300c(2, 26);
            uey g = this.f48520g.mo27444g(umd.f48194b);
            if (g != null) {
                c.mo28281a(new CallingAppInfo(g, 0));
            }
            if (upx != null) {
                if (!upx.f48501c.equals("__unknown_account_name")) {
                    c.mo28284a(upx.f48501c);
                }
                c.mo28288a(upx, i2, i);
            } else {
                c.mo28288a((upx) null, i2, i);
            }
            if (this.f48517d.mo27876b(j)) {
                c.mo28274a();
            } else if (i != 1) {
                f48514a.mo25369a("Persisted event %d: already deleted.", Long.valueOf(j));
            } else {
                f48514a.mo25377c("EventDistributor", "Error deleting persisted event");
            }
        } else {
            f48514a.mo25377c("EventDistributor", "Event to delete is not persisted yet");
        }
    }

    /* renamed from: a */
    public final void mo27862a(upx upx, uey uey) {
        uhj uhj;
        upx upx2 = upx;
        try {
            DriveId driveId = upx2.f48499a;
            sdo.m34959a(driveId);
            vpu a = vpu.m41034a();
            uhj uhj2 = a.f49756c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", upx2.f48507i);
            jSONObject.putOpt("accountName", upx2.f48500b);
            jSONObject.put("resolvedAccountName", upx2.f48501c);
            jSONObject.putOpt("overrideServicePackageName", upx2.f48508j);
            jSONObject.putOpt("baseContentHash", upx2.f48502d);
            jSONObject.putOpt("modifiedContentHash", upx2.f48503e);
            MetadataBundle metadataBundle = upx2.f48504f;
            if (metadataBundle != null) {
                jSONObject.put("modifiedMetadata", uyj.m39762b(metadataBundle));
            }
            jSONObject.put("trackingTags", new JSONArray((Collection) upx2.f48505g));
            JSONArray jSONArray = new JSONArray();
            for (txr txr : upx2.f48506h) {
                uhj uhj3 = uhj2;
                jSONArray.put(txr.f46950y);
                uhj2 = uhj3;
            }
            jSONObject.put("actionTypes", jSONArray);
            String jSONObject2 = jSONObject.toString();
            uin b = a.f49757d.mo27419b(uey);
            umd umd = r14;
            uhj = uhj2;
            umd umd2 = new umd(uhj2, -1, ukk.m38862a(driveId.f30729b), b.f48366m, jSONObject2, 0, 0, 0);
            uhj.mo27476b();
            umd.mo27725t();
            umd umd3 = umd;
            long j = umd3.f48366m;
            uql.m39246a(uhj, j, upx2.f48502d);
            uql.m39246a(uhj, j, upx2.f48503e);
            uhj.mo27480f();
            uhj.mo27478d();
            this.f48521h.execute(new uqc(this, umd3.f48366m));
        } catch (SQLException | JSONException e) {
            f48514a.mo25378c("EventDistributor", "Exception persisting completion event", e);
        } catch (Throwable th) {
            uhj.mo27478d();
            throw th;
        }
    }
}
