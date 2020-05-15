package p000;

import com.felicanetworks.mfc.Block;
import com.felicanetworks.mfc.BlockList;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;

/* renamed from: cila */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cila extends cikk {

    /* renamed from: a */
    private final brep f190583a;

    public cila(brep brep) {
        super(brep);
        this.f190583a = brep;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00af A[Catch:{ NumberFormatException | ParseException -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b9 A[Catch:{ NumberFormatException | ParseException -> 0x00ce }] */
    /* renamed from: a */
    private final void m150537a(cikn cikn) {
        byte[][] bArr = cikn.f190532a;
        ArrayList arrayList = new ArrayList();
        try {
            for (byte[] bArr2 : bArr) {
                int length = bArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (bArr2[i] > 0) {
                        cilo cilo = new cilo();
                        cilo.f190649a = (long) cikn.m150524b(bArr2, 13, 13);
                        cilo.f190650b = new BigDecimal(cikn.m150523a(bArr2, 4, 6));
                        cilo.f190651c = Currency.getInstance("JPY");
                        String a = cikn.m150523a(bArr2, 0, 2);
                        String str = "20" + a.substring(0, 2) + "/" + a.substring(2, 4) + "/" + a.substring(4);
                        Calendar instance = Calendar.getInstance();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.JAPAN);
                        simpleDateFormat.setLenient(false);
                        instance.setTime(simpleDateFormat.parse(str));
                        cilo.f190652d = instance.getTimeInMillis();
                        String a2 = cikn.m150523a(bArr2, 3, 3);
                        int hashCode = a2.hashCode();
                        char c = 65535;
                        if (hashCode != 1567) {
                            if (hashCode == 1598 && a2.equals("20")) {
                                c = 1;
                                if (c == 0) {
                                    cilo.f190653e = 1;
                                } else if (c != 1) {
                                    cilo.f190653e = 0;
                                } else {
                                    cilo.f190653e = 23;
                                }
                                arrayList.add(cilo);
                            }
                        } else if (a2.equals("10")) {
                            c = 0;
                            if (c == 0) {
                            }
                            arrayList.add(cilo);
                        }
                        if (c == 0) {
                        }
                        arrayList.add(cilo);
                    } else {
                        i++;
                    }
                }
            }
            srn srn = atgf.f90279a;
            this.f190583a.mo49932a(arrayList);
        } catch (NumberFormatException | ParseException e) {
            brep brep = this.f190583a;
            ciki ciki = ciki.TRANSACTIONINFO_PARSE_ERROR;
            ciki.m150513a(ciki);
            brep.mo49931a(new bres(ciki));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69520a(Felica felica) {
        byte[][] bArr;
        srn srn = atgf.f90279a;
        BlockList blockList = new BlockList();
        blockList.add(new Block(16527, 0));
        blockList.add(new Block(16527, 1));
        blockList.add(new Block(16527, 2));
        blockList.add(new Block(16527, 3));
        blockList.add(new Block(16527, 4));
        try {
            bArr = m150517a(felica, blockList);
        } catch (FelicaException e) {
            int type = e.getType();
            StringBuilder sb = new StringBuilder(76);
            sb.append("TransactionHistoryOperation#onFelicaOpened read FeliCa exception:");
            sb.append(type);
            sb.toString();
            if (e.getType() == 11) {
                bArr = (byte[][]) Array.newInstance(byte.class, 0, 0);
            } else {
                throw e;
            }
        }
        cikn cikn = new cikn();
        cikn.f190532a = bArr;
        return cikn;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69522a(Object obj) {
        cikn cikn = (cikn) obj;
        if (cikn.f190532a.length <= 0) {
            brep brep = this.f190583a;
            ciki ciki = ciki.UNSUPPORTED_OPERATION;
            ciki.m150513a(ciki);
            brep.mo49931a(new bres(ciki));
            return;
        }
        srn srn = atgf.f90279a;
        m150537a(cikn);
    }
}
