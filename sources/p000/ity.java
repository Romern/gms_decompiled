package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: ity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ity extends aaab {

    /* renamed from: h */
    private static final Logger f21744h = new Logger(new String[]{"RegisterForKeyPairOperation"}, (byte[]) null);

    /* renamed from: a */
    private final irw f21745a;

    /* renamed from: b */
    private final int f21746b;

    /* renamed from: c */
    private final List f21747c;

    /* renamed from: d */
    private final String f21748d;

    /* renamed from: e */
    private final Account f21749e;

    /* renamed from: f */
    private final List f21750f;

    /* renamed from: g */
    private final byte[] f21751g;

    public ity(irw irw, int i, List list, String str, Account account, List list2, byte[] bArr) {
        super(129, "RegisterForKeyPairOperation");
        this.f21745a = irw;
        this.f21746b = i;
        this.f21747c = list;
        this.f21748d = str;
        this.f21749e = account;
        this.f21750f = list2;
        this.f21751g = bArr;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8 A[SYNTHETIC, Splitter:B:51:0x00f8] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012d A[Catch:{ ehf -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bc A[Catch:{ ehf -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0231 A[Catch:{ ehf -> 0x0248 }] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        byte[] bArr;
        ehi ehi;
        long j;
        itd itd = new itd(context, this.f21746b, this.f21747c, this.f21748d, this.f21749e, this.f21750f, this.f21751g, null, null, null);
        try {
            itd.f21667j.mo25414c("ClientName calling Cryptauth is %s", itd.f21660c);
            ipr ipr = itd.f21664g;
            String str = itd.f21661d.name;
            List list = itd.f21659b;
            List list2 = itd.f21662e;
            if (list2 != null) {
                if (!list2.isEmpty()) {
                    sdo.m34977c(str);
                    sdo.m34975b(list.size() == list2.size(), "KeyNameList and keyMetadataList size don't match");
                    ipp a = ipp.m15839a(ipr.f21529a);
                    try {
                        SQLiteDatabase writableDatabase = a.getWritableDatabase();
                        writableDatabase.beginTransaction();
                        for (int i = 0; i < list.size(); i++) {
                            try {
                                String str2 = (String) list.get(i);
                                byte[] bArr2 = (byte[]) list2.get(i);
                                if (bArr2 != null && bArr2.length > 0) {
                                    ipr.f21528b.mo25412b("Updating keyMetadata for key=%s", str2);
                                    ContentValues contentValues = new ContentValues();
                                    ipr.m15847a(contentValues, str);
                                    contentValues.put("identifier", ipr.m15850b(str2));
                                    ipr.m15848a(contentValues, bArr2);
                                    if (!ccfj.m129446b()) {
                                        j = writableDatabase.insertWithOnConflict("metadata", null, contentValues, 5);
                                    } else {
                                        j = writableDatabase.insertWithOnConflict("metadata", null, contentValues, 5);
                                    }
                                    if (j < 0) {
                                        ipr.f21528b.mo25418e("Failed to insert keyMetadata for key=%s", str2);
                                    }
                                }
                            } catch (SQLiteException e) {
                                ipr.f21528b.mo25417e("Failed to update key metadata", e, new Object[0]);
                                j = -1;
                            } catch (Throwable th) {
                                writableDatabase.endTransaction();
                                a.close();
                                throw th;
                            }
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        a.close();
                    } catch (SQLiteException e2) {
                        ipr.f21528b.mo25417e("Failed to upload keyMetadata to db", e2, new Object[0]);
                    }
                    bArr = itd.f21663f;
                    if (bArr != null) {
                        try {
                            bsnm a2 = bsnm.m116012a(((bsnn) GeneratedMessageLite.m124014a(bsnn.f146304c, bArr)).f146306a);
                            if (a2 == null) {
                                a2 = bsnm.UNRECOGNIZED;
                            }
                            itd.f21664g.mo13228a(itd.f21661d.name, a2, itd.f21663f);
                        } catch (bxwf e3) {
                            itd.f21667j.mo25416d("Unable to parse featureMetadata. Not adding to db.", new Object[0]);
                        }
                    }
                    if (ccfg.f178858a.mo6606a().mo75852d()) {
                        if (itd.f21664g.mo13229a(itd.f21661d.name, bsnm.FIDO) == null) {
                            bxvd da = bsnn.f146304c.mo74144da();
                            bsnm bsnm = bsnm.FIDO;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((bsnn) da.f164949b).f146306a = bsnm.mo3214a();
                            bxvd da2 = bsns.f146327b.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((bsns) da2.f164949b).f146329a = 0;
                            ByteString aL = ((bsns) da2.mo74062i()).mo73639aL();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aL.getClass();
                            ((bsnn) da.f164949b).f146307b = aL;
                            itd.f21664g.mo13228a(itd.f21661d.name, bsnm.FIDO, ((bsnn) da.mo74062i()).serializeToBytes());
                        }
                    }
                    if (itd.f21658a.mo66917a().mo66925c((CharSequence) ipl.f21498h.mo58455c()).contains(itd.f21660c)) {
                        itd.f21666i.mo13247a(itd.f21661d.name, itd.f21659b);
                        ite ite = itd.f21665h;
                        Account account = itd.f21661d;
                        String valueOf = String.valueOf(account.name);
                        String str3 = valueOf.length() == 0 ? new String("NonImmediateTag_") : "NonImmediateTag_".concat(valueOf);
                        long intValue = (long) ((Integer) ipl.f21500j.mo58455c()).intValue();
                        long intValue2 = intValue + ((long) ((Integer) ipl.f21501k.mo58455c()).intValue());
                        ite.f21678b.mo25412b("schedule enrollment for delayed keys : start=%d, end=%d", Long.valueOf(intValue), Long.valueOf(intValue2));
                        ite.mo13335a(str3, account.name, ite.f21677a, intValue, intValue2, false);
                        ehg ehg = new ehg();
                        ehg.f14948a = ehh.ENROLLMENT_RUN_SCHEDULED;
                        ehi = ehg.mo10145a();
                    } else {
                        ehi = itd.mo13333a(itd.f21659b);
                    }
                    this.f21745a.mo13305a(new KeyRegistrationResult(ito.m16125a(ehi.f14968a), null, null));
                }
            }
            ipr.f21528b.mo25412b("Null/empty keyMetadataList.", new Object[0]);
            bArr = itd.f21663f;
            if (bArr != null) {
            }
            if (ccfg.f178858a.mo6606a().mo75852d()) {
            }
            if (itd.f21658a.mo66917a().mo66925c((CharSequence) ipl.f21498h.mo58455c()).contains(itd.f21660c)) {
            }
            this.f21745a.mo13305a(new KeyRegistrationResult(ito.m16125a(ehi.f14968a), null, null));
        } catch (ehf e4) {
            Logger Logger = f21744h;
            String valueOf2 = String.valueOf(e4.f14947a.toString());
            Logger.mo25415d(valueOf2.length() == 0 ? new String("Failed to perform enrollment. StatusCode=") : "Failed to perform enrollment. StatusCode=".concat(valueOf2), e4, new Object[0]);
            this.f21745a.mo13306a(ito.m16125a(e4.f14947a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21745a.mo13306a(status);
    }
}
