package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard;
import com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: atjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjy extends atki {
    public atjy(SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest, String str, aswm aswm) {
        super("SetQuickAccessWalletCards", setQuickAccessWalletCardsRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49629f(status);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:99:0x02a5 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard} */
    /* JADX WARN: Type inference failed for: r2v25, assign insn: PHI: (r2v25 ?) = (r2v24 android.database.sqlite.SQLiteDatabase), (r2v36 android.database.sqlite.SQLiteDatabase) binds: [B:99:0x02a5, B:162:0x03ce] */
    /* JADX WARN: Type inference failed for: r2v64, assign insn: 0x028b: MOVE  (r2v64 ? I:?[OBJECT, ARRAY]) = (r21v1 java.lang.Object) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    public final void mo50005b(Context context) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteDatabase sQLiteDatabase2;
        bngx bngx;
        String str;
        byte[] bArr;
        FileOutputStream fileOutputStream;
        Throwable th2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        atek atek = new atek(askg.m74279a(((SetQuickAccessWalletCardsRequest) this.f90410b).f108640b.name, context), ((SetQuickAccessWalletCardsRequest) this.f90410b).f108639a);
        try {
            SQLiteDatabase sQLiteDatabase3 = ((SetQuickAccessWalletCardsRequest) this.f90410b).f108641c;
            String str2 = this.f90413c;
            if (cgwk.m147215c()) {
                try {
                    int length = sQLiteDatabase3.length;
                    HashSet a = bnpf.m110048a(length);
                    for (QuickAccessWalletCard quickAccessWalletCard : sQLiteDatabase3) {
                        String str3 = quickAccessWalletCard.f108628a;
                        if (str3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bmxy.m108589a(z, "card id null");
                        bmxy.m108589a(!a.contains(str3), "card ids not unique");
                        a.add(str3);
                        if (quickAccessWalletCard.f108629b != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bmxy.m108589a(z2, "card image missing");
                        bmxy.m108589a(!TextUtils.isEmpty(quickAccessWalletCard.f108630c), "content desc empty");
                        if (quickAccessWalletCard.f108631d != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bmxy.m108589a(z3, "intents null");
                        if (quickAccessWalletCard.f108631d.length > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        bmxy.m108589a(z4, "intents empty");
                        WalletCardIntent[] walletCardIntentArr = quickAccessWalletCard.f108631d;
                        for (WalletCardIntent walletCardIntent : walletCardIntentArr) {
                            bmxy.m108589a(!TextUtils.isEmpty(walletCardIntent.f108643b), "intent action empty");
                            bmxy.m108589a(!TextUtils.isEmpty(walletCardIntent.f108642a), "intent class empty");
                        }
                    }
                    File a2 = asmd.m74370a(atek.f90188b.f89126d);
                    a2.mkdirs();
                    File a3 = atek.mo49899a();
                    int length2 = sQLiteDatabase3.length;
                    ArrayList arrayList = new ArrayList(length2);
                    int i = 0;
                    while (i < length2) {
                        QuickAccessWalletCard[] quickAccessWalletCardArr = sQLiteDatabase3;
                        atek atek2 = atek;
                        String str4 = str2;
                        ArrayList arrayList2 = arrayList;
                        QuickAccessWalletCard quickAccessWalletCard2 = quickAccessWalletCardArr[i];
                        askf askf = atek2.f90188b;
                        String a4 = asmd.m74372a(String.format("%s:%s:%s", askf.f89125c, askf.f89123a, quickAccessWalletCard2.f108628a));
                        File file = new File(a2, a4);
                        File file2 = new File(a3, a4);
                        Bitmap bitmap = quickAccessWalletCard2.f108629b;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        fileOutputStream = new FileOutputStream(file);
                        byteArrayOutputStream.writeTo(fileOutputStream);
                        fileOutputStream.close();
                        if (!file.renameTo(file2)) {
                            String valueOf = String.valueOf(a4);
                            throw new IOException(valueOf.length() == 0 ? new String("Unable to rename file: ") : "Unable to rename file: ".concat(valueOf));
                        }
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(file2.getPath());
                        i++;
                        arrayList = arrayList3;
                        str2 = str4;
                        sQLiteDatabase3 = quickAccessWalletCardArr;
                        atek = atek2;
                    }
                    SQLiteDatabase a5 = asko.m74292a(atek.f90188b.f89126d).mo49214a();
                    a5.beginTransaction();
                    try {
                        a5.execSQL("DELETE FROM QuickAccessWalletCards WHERE account_id=? AND environment=? AND wallet_source=? ", atek.mo49900b());
                        int i2 = 0;
                        while (i2 < sQLiteDatabase3.length) {
                            QuickAccessWalletCard quickAccessWalletCard3 = sQLiteDatabase3[i2];
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("account_id", atek.f90188b.f89123a);
                            contentValues.put("environment", atek.f90188b.f89125c);
                            contentValues.put("wallet_source", Integer.valueOf(atek.f90189c));
                            contentValues.put("card_id", quickAccessWalletCard3.f108628a);
                            contentValues.put("card_index", Integer.valueOf(i2));
                            ArrayList arrayList4 = arrayList;
                            contentValues.put("available_timestamp", Long.valueOf(quickAccessWalletCard3.f108633f));
                            contentValues.put("expiration_timestamp", Long.valueOf(quickAccessWalletCard3.f108634g));
                            contentValues.put("card_image_filename", (String) arrayList.get(i2));
                            bxvd da = atet.f90202d.mo74144da();
                            String str5 = quickAccessWalletCard3.f108630c;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            str5.getClass();
                            ((atet) da.f164949b).f90204a = str5;
                            WalletCardIntent[] walletCardIntentArr2 = quickAccessWalletCard3.f108631d;
                            int length3 = walletCardIntentArr2.length;
                            ArrayList arrayList5 = new ArrayList(length3);
                            int i3 = 0;
                            while (i3 < length3) {
                                try {
                                    WalletCardIntent walletCardIntent2 = walletCardIntentArr2[i3];
                                    WalletCardIntent[] walletCardIntentArr3 = walletCardIntentArr2;
                                    bxvd da2 = ates.f90196e.mo74144da();
                                    int i4 = length3;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    ates ates = (ates) da2.f164949b;
                                    str2.getClass();
                                    ates.f90198a = str2;
                                    String str6 = str2;
                                    String str7 = walletCardIntent2.f108642a;
                                    str7.getClass();
                                    ates.f90199b = str7;
                                    String str8 = walletCardIntent2.f108643b;
                                    str8.getClass();
                                    ates.f90200c = str8;
                                    WalletCardIntentExtra[] walletCardIntentExtraArr = walletCardIntent2.f108644c;
                                    int length4 = walletCardIntentExtraArr.length;
                                    ArrayList arrayList6 = new ArrayList(length4);
                                    Object obj = sQLiteDatabase3;
                                    int i5 = 0;
                                    while (i5 < length4) {
                                        int i6 = length4;
                                        WalletCardIntentExtra walletCardIntentExtra = walletCardIntentExtraArr[i5];
                                        WalletCardIntentExtra[] walletCardIntentExtraArr2 = walletCardIntentExtraArr;
                                        bxvd da3 = ater.f90191d.mo74144da();
                                        atek atek3 = atek;
                                        String str9 = walletCardIntentExtra.f108645a;
                                        int i7 = i2;
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        ater ater = (ater) da3.f164949b;
                                        str9.getClass();
                                        ater.f90195c = str9;
                                        int i8 = walletCardIntentExtra.f108646b;
                                        sQLiteDatabase2 = a5;
                                        if (i8 == 3) {
                                            try {
                                                boolean z5 = walletCardIntentExtra.f108649e;
                                                ater.f90193a = 4;
                                                ater.f90194b = Boolean.valueOf(z5);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                sQLiteDatabase = sQLiteDatabase2;
                                                sQLiteDatabase.endTransaction();
                                                throw th;
                                            }
                                        } else if (i8 == 2 && (bArr = walletCardIntentExtra.f108648d) != null) {
                                            ByteString a6 = ByteString.m123261a(bArr);
                                            if (da3.f164950c) {
                                                da3.mo74035c();
                                                da3.f164950c = false;
                                            }
                                            ater ater2 = (ater) da3.f164949b;
                                            a6.getClass();
                                            ater2.f90193a = 3;
                                            ater2.f90194b = a6;
                                        } else if (i8 == 1 && (str = walletCardIntentExtra.f108647c) != null) {
                                            str.getClass();
                                            ater.f90193a = 2;
                                            ater.f90194b = str;
                                        } else if (i8 == 4) {
                                            int i9 = walletCardIntentExtra.f108650f;
                                            ater.f90193a = 5;
                                            ater.f90194b = Integer.valueOf(i9);
                                        } else if (i8 != 5) {
                                            ((bnsl) atek.f90187a.mo68388c()).mo68420a("Proto storage conversion failed for extra %s", walletCardIntentExtra.f108645a);
                                            i5++;
                                            length4 = i6;
                                            atek = atek3;
                                            walletCardIntentExtraArr = walletCardIntentExtraArr2;
                                            i2 = i7;
                                            a5 = sQLiteDatabase2;
                                        } else {
                                            long j = walletCardIntentExtra.f108651g;
                                            ater.f90193a = 6;
                                            ater.f90194b = Long.valueOf(j);
                                        }
                                        arrayList6.add((ater) da3.mo74062i());
                                        i5++;
                                        length4 = i6;
                                        atek = atek3;
                                        walletCardIntentExtraArr = walletCardIntentExtraArr2;
                                        i2 = i7;
                                        a5 = sQLiteDatabase2;
                                    }
                                    atek atek4 = atek;
                                    SQLiteDatabase sQLiteDatabase4 = a5;
                                    int i10 = i2;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    ates ates2 = (ates) da2.f164949b;
                                    if (!ates2.f90201d.mo73666a()) {
                                        ates2.f90201d = GeneratedMessageLite.m124021a(ates2.f90201d);
                                    }
                                    bxsy.m123078a(arrayList6, ates2.f90201d);
                                    arrayList5.add((ates) da2.mo74062i());
                                    i3++;
                                    length3 = i4;
                                    walletCardIntentArr2 = walletCardIntentArr3;
                                    str2 = str6;
                                    sQLiteDatabase3 = obj;
                                    atek = atek4;
                                    i2 = i10;
                                    a5 = sQLiteDatabase4;
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteDatabase = a5;
                                    sQLiteDatabase.endTransaction();
                                    throw th;
                                }
                            }
                            QuickAccessWalletCard[] quickAccessWalletCardArr2 = sQLiteDatabase3;
                            atek atek5 = atek;
                            String str10 = str2;
                            sQLiteDatabase2 = a5;
                            int i11 = i2;
                            try {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                atet atet = (atet) da.f164949b;
                                if (!atet.f90205b.mo73666a()) {
                                    atet.f90205b = GeneratedMessageLite.m124021a(atet.f90205b);
                                }
                                bxsy.m123078a(arrayList5, atet.f90205b);
                                CardIconMessage[] cardIconMessageArr = quickAccessWalletCard3.f108632e;
                                if (cardIconMessageArr != null) {
                                    int length5 = cardIconMessageArr.length;
                                    ArrayList arrayList7 = new ArrayList(length5);
                                    int i12 = 0;
                                    while (i12 < length5) {
                                        CardIconMessage cardIconMessage = cardIconMessageArr[i12];
                                        int[] iArr = cardIconMessage.f108623a;
                                        int length6 = iArr.length;
                                        ArrayList arrayList8 = new ArrayList(length6);
                                        int i13 = 0;
                                        while (i13 < length6) {
                                            arrayList8.add(atee.m75732a(iArr[i13]));
                                            i13++;
                                            cardIconMessageArr = cardIconMessageArr;
                                        }
                                        bxvd da4 = atef.f90180d.mo74144da();
                                        if (da4.f164950c) {
                                            da4.mo74035c();
                                            da4.f164950c = false;
                                        }
                                        atef atef = (atef) da4.f164949b;
                                        if (!atef.f90182a.mo73666a()) {
                                            atef.f90182a = GeneratedMessageLite.m124019a(atef.f90182a);
                                        }
                                        int size = arrayList8.size();
                                        int i14 = 0;
                                        while (i14 < size) {
                                            atef.f90182a.mo74153d(((atee) arrayList8.get(i14)).mo3214a());
                                            i14++;
                                            cardIconMessageArr = cardIconMessageArr;
                                        }
                                        CardIconMessage[] cardIconMessageArr2 = cardIconMessageArr;
                                        int i15 = cardIconMessage.f108624b;
                                        int i16 = i15 != 0 ? i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
                                        if (da4.f164950c) {
                                            da4.mo74035c();
                                            da4.f164950c = false;
                                        }
                                        ((atef) da4.f164949b).f90183b = i16 - 2;
                                        String str11 = cardIconMessage.f108625c;
                                        str11.getClass();
                                        ((atef) da4.f164949b).f90184c = str11;
                                        arrayList7.add((atef) da4.mo74062i());
                                        i12++;
                                        cardIconMessageArr = cardIconMessageArr2;
                                    }
                                    bngx = bngx.m109368a((Collection) arrayList7);
                                } else {
                                    bngx = bngx.m109376e();
                                }
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                atet atet2 = (atet) da.f164949b;
                                if (!atet2.f90206c.mo73666a()) {
                                    atet2.f90206c = GeneratedMessageLite.m124021a(atet2.f90206c);
                                }
                                bxsy.m123078a(bngx, atet2.f90206c);
                                contentValues.put("wallet_card", ((atet) da.mo74062i()).serializeToBytes());
                                sQLiteDatabase3 = sQLiteDatabase2;
                                bmxy.m108601b(sQLiteDatabase3.insert("QuickAccessWalletCards ", null, contentValues) != -1, "wallet card insert failed");
                                i2 = i11 + 1;
                                a5 = sQLiteDatabase3;
                                arrayList = arrayList4;
                                str2 = str10;
                                sQLiteDatabase3 = quickAccessWalletCardArr2;
                                atek = atek5;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteDatabase = sQLiteDatabase3;
                                th = th;
                                sQLiteDatabase.endTransaction();
                                throw th;
                            }
                        }
                        atek atek6 = atek;
                        SQLiteDatabase sQLiteDatabase5 = a5;
                        sQLiteDatabase5.setTransactionSuccessful();
                        sQLiteDatabase5.endTransaction();
                        asmd.m74374a(atek6.mo49899a(), atxr.m76517a(asko.m74292a(atek6.f90188b.f89126d).mo49214a(), atej.f90186a, "SELECT card_image_filename FROM QuickAccessWalletCards ", new String[0]));
                    } catch (Throwable th6) {
                        th = th6;
                        sQLiteDatabase = a5;
                        th = th;
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } catch (IllegalArgumentException e) {
                    e = e;
                    throw new aaaj(10, e.getMessage());
                } catch (IOException | IllegalStateException e2) {
                    e = e2;
                    throw new aaaj(8, e.getMessage());
                } catch (Throwable th7) {
                    bqye.m113761a(th2, th7);
                }
            }
            this.f90414d.mo49629f(Status.f30107a);
            return;
            throw th2;
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new aaaj(10, e.getMessage());
        } catch (IOException | IllegalStateException e4) {
            e = e4;
            throw new aaaj(8, e.getMessage());
        }
    }
}
