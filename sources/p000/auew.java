package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.telephony.TelephonyManager;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: auew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auew extends aaab {

    /* renamed from: a */
    private final audg f91602a = audg.m76790a("ReportSpamStatusOperation");

    /* renamed from: b */
    private final rnt f91603b;

    /* renamed from: c */
    private final String f91604c;

    /* renamed from: d */
    private final boolean f91605d;

    /* renamed from: e */
    private final String f91606e;

    /* renamed from: f */
    private final int f91607f;

    /* renamed from: g */
    private final long f91608g;

    /* renamed from: h */
    private final long f91609h;

    /* renamed from: i */
    private final bqic[] f91610i;

    /* renamed from: j */
    private final bows f91611j;

    /* renamed from: k */
    private final int f91612k;

    /* renamed from: l */
    private final int f91613l;

    public auew(rnt rnt, String str, boolean z, String str2, int i, long j, int i2, long j2, bqic[] bqicArr, bows bows, int i3) {
        super(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, "ReportSpamStatus");
        this.f91603b = rnt;
        this.f91604c = str;
        this.f91605d = z;
        this.f91606e = str2;
        this.f91607f = i;
        this.f91608g = j;
        this.f91612k = i2;
        this.f91609h = j2;
        this.f91610i = bqicArr;
        this.f91611j = bows;
        this.f91613l = i3;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x069b, code lost:
        r0 = th;
     */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        Throwable th;
        bowk bowk;
        int i;
        int i2;
        int i3;
        long j;
        Context context2 = context;
        if (cgyd.f188020a.mo6606a().mo84726c()) {
            TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
            audk audk = new audk(context2);
            String a = audh.m76796a(telephonyManager, this.f91604c);
            String simCountryIso = telephonyManager.getSimCountryIso();
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            Object[] objArr = {this.f91604c, Integer.valueOf(this.f91607f)};
            Object[] objArr2 = {this.f91604c, a};
            this.f91602a.mo50422a("Reporting spam status:\nIs Spam:%s\nApp Package Name:%s\nApp Type:%s\nSpam Type:%s\n", Boolean.valueOf(this.f91605d), this.f91606e, Integer.valueOf(this.f91607f), this.f91611j);
            String str = this.f91606e;
            int i4 = this.f91607f;
            boolean z2 = this.f91605d;
            long j2 = this.f91608g;
            int i5 = this.f91612k;
            int i6 = i4;
            long j3 = this.f91609h;
            bqic[] bqicArr = this.f91610i;
            bows bows = this.f91611j;
            int i7 = this.f91613l;
            long j4 = j3;
            String valueOf = String.valueOf(a);
            if (valueOf.length() == 0) {
                new String("Reporting spam number: ");
            } else {
                "Reporting spam number: ".concat(valueOf);
            }
            bxvd da = bowt.f135173t.mo74144da();
            bxvd da2 = bxyk.f165095c.mo74144da();
            int i8 = i5;
            long j5 = j2;
            long seconds = TimeUnit.HOURS.toSeconds(TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis()));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bxyk) da2.f164949b).f165097a = seconds;
            bxyk bxyk = (bxyk) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bowt bowt = (bowt) da.f164949b;
            bxyk.getClass();
            bowt.f135180f = bxyk;
            int i9 = bowt.f135175a | 16;
            bowt.f135175a = i9;
            str.getClass();
            int i10 = i9 | 2097152;
            bowt.f135175a = i10;
            bowt.f135192r = str;
            "gmscore".getClass();
            int i11 = i10 | 1;
            bowt.f135175a = i11;
            bowt.f135176b = "gmscore";
            a.getClass();
            int i12 = 8;
            int i13 = i11 | 8;
            bowt.f135175a = i13;
            bowt.f135179e = a;
            simCountryIso.getClass();
            int i14 = i13 | 128;
            bowt.f135175a = i14;
            bowt.f135183i = simCountryIso;
            networkCountryIso.getClass();
            int i15 = i14 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bowt.f135175a = i15;
            bowt.f135184j = networkCountryIso;
            bowt.f135178d = (!z2 ? 2 : 3) - 1;
            bowt.f135175a = i15 | 4;
            if (bows == null) {
                bows = bows.UNKNOWN_SPAMTYPE;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bowt bowt2 = (bowt) da.f164949b;
            bowt2.f135181g = bows.f135172l;
            int i16 = bowt2.f135175a | 32;
            bowt2.f135175a = i16;
            int i17 = i7 - 1;
            if (i7 != 0) {
                bowt2.f135182h = i17;
                bowt2.f135175a = i16 | 64;
                int i18 = i6;
                String valueOf2 = String.valueOf(audi.m76797a(context2, i18));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bowt bowt3 = (bowt) da.f164949b;
                valueOf2.getClass();
                bowt3.f135175a |= 512;
                bowt3.f135185k = valueOf2;
                String valueOf3 = String.valueOf(audi.m76803b(context2, i18));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bowt bowt4 = (bowt) da.f164949b;
                valueOf3.getClass();
                bowt4.f135175a |= 1024;
                bowt4.f135186l = valueOf3;
                audj a2 = audj.m76808a(context);
                int a3 = a2.mo50426a(a, i18);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bowt bowt5 = (bowt) da.f164949b;
                bowt5.f135175a |= 8192;
                if (a3 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                bowt5.f135188n = z;
                int b = a2.mo50428b(a, i18);
                boolean z3 = b == 1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bowt bowt6 = (bowt) da.f164949b;
                int i19 = bowt6.f135175a | 2048;
                bowt6.f135175a = i19;
                bowt6.f135187m = z3;
                boolean z4 = b == 2;
                bowt6.f135175a = 65536 | i19;
                bowt6.f135189o = z4;
                C1223np npVar = new C1223np();
                npVar.put("phone_number", a);
                npVar.put("current_global_blacklist_version ", String.valueOf(audi.m76797a(context2, i18)));
                String a4 = vvp.m41461a(context2, "telephony-identity", npVar);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bowt bowt7 = (bowt) da.f164949b;
                a4.getClass();
                bowt7.f135175a |= 2;
                bowt7.f135177c = a4;
                bxvd da3 = bowk.f135143l.mo74144da();
                Cursor a5 = a2.mo50427a("sip_header_table", "number=?", new String[]{a});
                try {
                    if (a5.getCount() == 0) {
                        bowk = (bowk) da3.mo74062i();
                        if (a5 != null) {
                            a5.close();
                        }
                    } else {
                        if (a5.moveToFirst()) {
                            int i20 = a5.getInt(a5.getColumnIndex("result"));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bowk bowk2 = (bowk) da3.f164949b;
                            bowk2.f135145a |= 512;
                            bowk2.f135155k = i20;
                            String string = a5.getString(a5.getColumnIndex("p_asserted_identity"));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bowk bowk3 = (bowk) da3.f164949b;
                            string.getClass();
                            bowk3.f135145a |= 1;
                            bowk3.f135146b = string;
                            String string2 = a5.getString(a5.getColumnIndex("to_hostname"));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bowk bowk4 = (bowk) da3.f164949b;
                            string2.getClass();
                            bowk4.f135145a |= 2;
                            bowk4.f135147c = string2;
                            String string3 = a5.getString(a5.getColumnIndex("from_header"));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bowk bowk5 = (bowk) da3.f164949b;
                            string3.getClass();
                            bowk5.f135145a |= 4;
                            bowk5.f135148d = string3;
                            int i21 = a5.getInt(a5.getColumnIndex("content_length"));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bowk bowk6 = (bowk) da3.f164949b;
                            bowk6.f135145a |= 8;
                            bowk6.f135149e = i21;
                            int i22 = a5.getInt(a5.getColumnIndex("max_forwards"));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bowk bowk7 = (bowk) da3.f164949b;
                            bowk7.f135145a |= 16;
                            bowk7.f135150f = i22;
                            String string4 = a5.getString(a5.getColumnIndex("user_agent"));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bowk bowk8 = (bowk) da3.f164949b;
                            string4.getClass();
                            bowk8.f135145a |= 32;
                            bowk8.f135151g = string4;
                            boolean z5 = a5.getInt(a5.getColumnIndex("is_ims")) == 1;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bowk bowk9 = (bowk) da3.f164949b;
                            bowk9.f135145a |= 64;
                            bowk9.f135152h = z5;
                            boolean z6 = a5.getInt(a5.getColumnIndex("is_forwarded")) == 1;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bowk bowk10 = (bowk) da3.f164949b;
                            bowk10.f135145a |= 128;
                            bowk10.f135153i = z6;
                            String string5 = a5.getString(a5.getColumnIndex("carrier"));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bowk bowk11 = (bowk) da3.f164949b;
                            string5.getClass();
                            bowk11.f135145a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bowk11.f135154j = string5;
                        }
                        if (a5 != null) {
                            a5.close();
                        }
                        bowk = (bowk) da3.mo74062i();
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bowt bowt8 = (bowt) da.f164949b;
                    bowk.getClass();
                    bowt8.f135193s = bowk;
                    bowt8.f135175a |= 4194304;
                    bowt bowt9 = (bowt) da.mo74062i();
                    String valueOf4 = String.valueOf(bowt9);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 12);
                    sb.append("SpamReport: ");
                    sb.append(valueOf4);
                    sb.toString();
                    bxvd da4 = bowu.f135194c.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bowu bowu = (bowu) da4.f164949b;
                    bowt9.getClass();
                    bowu.f135197b = bowt9;
                    bowu.f135196a |= 1;
                    bowu bowu2 = (bowu) da4.mo74062i();
                    if (audp.f91423a == null) {
                        synchronized (audp.class) {
                            if (audp.f91423a == null) {
                                audp.f91423a = new qws(rpr.m34216b(), "SCOOBY_SPAM_REPORT_LOG", null);
                            }
                        }
                    }
                    audp.f91423a.mo24335a(bowu2.serializeToBytes()).mo24327b();
                    int a6 = bowq.m111617a(bowt9.f135178d);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    int i23 = a6 - 1;
                    if (i23 == 0) {
                        i = 2;
                    } else if (i23 != 1) {
                        i = 4;
                    } else {
                        i = 3;
                    }
                    bows a7 = bows.m111619a(bowt9.f135181g);
                    if (a7 == null) {
                        a7 = bows.UNKNOWN_SPAMTYPE;
                    }
                    switch (a7.f135172l) {
                        case 0:
                            i12 = 2;
                            break;
                        case 1:
                            i12 = 3;
                            break;
                        case 2:
                            i12 = 4;
                            break;
                        case 3:
                            i12 = 5;
                            break;
                        case 4:
                            i12 = 6;
                            break;
                        case 5:
                            i12 = 7;
                            break;
                        case 6:
                            break;
                        case 7:
                            i12 = 9;
                            break;
                        case 8:
                            i12 = 10;
                            break;
                        case 9:
                            i12 = 11;
                            break;
                        default:
                            i12 = 12;
                            break;
                    }
                    int a8 = bowo.m111615a(bowt9.f135182h);
                    if (a8 == 0) {
                        a8 = 1;
                    }
                    int i24 = a8 - 1;
                    if (i24 != 0) {
                        i2 = i24 != 1 ? 0 : 3;
                    } else {
                        i2 = 2;
                    }
                    int a9 = bowm.m111613a(bowt9.f135191q);
                    if (a9 == 0) {
                        a9 = 1;
                    }
                    int i25 = a9 - 1;
                    if (i25 != 0) {
                        i3 = i25 != 1 ? i25 != 2 ? i25 != 3 ? 6 : 5 : 4 : 3;
                    } else {
                        i3 = 2;
                    }
                    bxvd da5 = bqid.f140771r.mo74144da();
                    String str2 = bowt9.f135176b;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bqid bqid = (bqid) da5.f164949b;
                    str2.getClass();
                    bqid.f140773a = str2;
                    String str3 = bowt9.f135177c;
                    str3.getClass();
                    bqid.f140774b = str3;
                    bqid.f140775c = i - 2;
                    String str4 = bowt9.f135179e;
                    str4.getClass();
                    ((bqid) da5.f164949b).f140776d = str4;
                    bxyk bxyk2 = bowt9.f135180f;
                    if (bxyk2 == null) {
                        bxyk2 = bxyk.f165095c;
                    }
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bqid bqid2 = (bqid) da5.f164949b;
                    bxyk2.getClass();
                    bqid2.f140777e = bxyk2;
                    bqid2.f140778f = i12 - 2;
                    if (i2 == 0) {
                        i2 = 2;
                    }
                    bqid bqid3 = (bqid) da5.f164949b;
                    if (i2 != 1) {
                        bqid3.f140779g = i2 - 2;
                        String str5 = bowt9.f135183i;
                        bqid bqid4 = (bqid) da5.f164949b;
                        str5.getClass();
                        bqid4.f140780h = str5;
                        String str6 = bowt9.f135184j;
                        str6.getClass();
                        bqid4.f140781i = str6;
                        String str7 = bowt9.f135185k;
                        str7.getClass();
                        bqid4.f140782j = str7;
                        String str8 = bowt9.f135186l;
                        str8.getClass();
                        bqid4.f140783k = str8;
                        bqid4.f140784l = bowt9.f135187m;
                        bqid4.f140785m = bowt9.f135189o;
                        bqid4.f140786n = bowt9.f135190p;
                        bqid4.f140787o = i3 - 2;
                        String str9 = bowt9.f135192r;
                        str9.getClass();
                        ((bqid) da5.f164949b).f140789q = str9;
                        List asList = Arrays.asList(bqicArr);
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bqid bqid5 = (bqid) da5.f164949b;
                        if (!bqid5.f140788p.mo73666a()) {
                            bqid5.f140788p = GeneratedMessageLite.m124021a(bqid5.f140788p);
                        }
                        bxsy.m123078a(asList, bqid5.f140788p);
                        bqid bqid6 = (bqid) da5.mo74062i();
                        String valueOf5 = String.valueOf(bqid6);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf5).length() + 21);
                        sb2.append("Report Spam Request: ");
                        sb2.append(valueOf5);
                        sb2.toString();
                        try {
                            ClientContext a10 = audk.m76813a(context);
                            audl audl = audk.f91418a;
                            if (audl.f91420c == null) {
                                audl.f91420c = chtv.m149566a(chtu.UNARY, "scooby.SpamProtectionService/ReportSpam", ciie.m150370a(bqid.f140771r), ciie.m150370a(bqie.f140790a));
                            }
                            String valueOf6 = String.valueOf((bqie) audl.f91422a.mo25553a(audl.f91420c, a10, bqid6, 10000, TimeUnit.MILLISECONDS));
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf6).length() + 22);
                            sb3.append("Report Spam Response: ");
                            sb3.append(valueOf6);
                            sb3.toString();
                        } catch (chuw | gid e) {
                            audg audg = audr.f91425a;
                            String valueOf7 = String.valueOf(e);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf7).length() + 30);
                            sb4.append("Could not report spam to GRPC\n");
                            sb4.append(valueOf7);
                            audg.mo50425c(sb4.toString());
                        }
                        audq.m76832a(context, audq.m76830a(i18), bowt9, j5, i8, j4);
                        audj.m76808a(context);
                        int i26 = this.f91607f;
                        boolean z7 = this.f91605d;
                        try {
                            SQLiteDatabase writableDatabase = audj.f91417a.getWritableDatabase();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("number", a);
                            contentValues.put("spam_status", Integer.valueOf(z7 ? 1 : 0));
                            contentValues.put("app_type", Integer.valueOf(i26));
                            j = writableDatabase.insertWithOnConflict("client_spam_table", null, contentValues, 5);
                        } catch (SQLiteException e2) {
                            j = 0;
                        }
                        if (j == -1) {
                            this.f91602a.mo50424b("Unable to write to local blacklist. status code: %d", Long.valueOf(j));
                            this.f91603b.mo11797a(Status.f30109c);
                            return;
                        }
                        this.f91603b.mo11797a(Status.f30107a);
                        return;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            } else {
                throw null;
            }
        } else {
            this.f91603b.mo11797a(Status.f30107a);
            return;
        }
        while (true) {
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f91603b.mo11797a(status);
    }
}
