package com.google.android.gms.walletp2p.feature.common.transferparams;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.walletp2p.internal.zeroparty.Transaction;
import com.google.android.gms.walletp2p.p089ui.TransferData;
import com.google.android.libraries.walletp2p.model.Contact;
import java.text.ParseException;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransferParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new axfl();

    /* renamed from: a */
    public static final TransferParams f110642a = new TransferParams(1, 0, false, null, null, false, null, false);

    /* renamed from: b */
    public btsb f110643b;

    /* renamed from: c */
    public final String f110644c;

    /* renamed from: d */
    public String f110645d;

    /* renamed from: e */
    public int f110646e;

    /* renamed from: f */
    public Contact f110647f;

    /* renamed from: g */
    public final boolean f110648g;

    /* renamed from: h */
    public final String f110649h;

    /* renamed from: i */
    public Transaction f110650i;

    /* renamed from: j */
    public final boolean f110651j;

    /* renamed from: k */
    public boolean f110652k;

    /* renamed from: l */
    public final int f110653l;

    /* renamed from: m */
    private final boolean f110654m;

    public TransferParams(int i, int i2, boolean z, btsb btsb, String str, boolean z2, String str2, boolean z3) {
        this.f110653l = i;
        this.f110646e = i2;
        this.f110643b = btsb;
        this.f110644c = str;
        this.f110648g = z2;
        this.f110654m = z;
        this.f110649h = str2;
        this.f110651j = z3;
    }

    /* renamed from: a */
    public static btsb m94306a(long j, String str) {
        bxvd da = btsb.f150174d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btsb btsb = (btsb) da.f164949b;
        int i = btsb.f150176a | 1;
        btsb.f150176a = i;
        btsb.f150177b = j;
        str.getClass();
        btsb.f150176a = i | 2;
        btsb.f150178c = str;
        return (btsb) da.mo74062i();
    }

    /* renamed from: b */
    private static btsb m94315b(long j, String str) {
        sdo.m34975b(!TextUtils.isEmpty(str), "Currency code is required alongside amount");
        String upperCase = str.toUpperCase();
        if (!beqh.m95434a(upperCase).equals(beqh.f112039a)) {
            return m94306a(j, upperCase);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 29);
        sb.append("Unsupported currency code: \"");
        sb.append(upperCase);
        sb.append("\"");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final boolean mo60153a() {
        int i = this.f110653l;
        return i == 3 || i == 9;
    }

    /* renamed from: b */
    public final boolean mo60155b() {
        return this.f110654m && this.f110653l != 6;
    }

    /* renamed from: c */
    public final boolean mo60156c() {
        btsb btsb = this.f110643b;
        return btsb != null && btsb.f150177b > 0;
    }

    @Deprecated
    /* renamed from: d */
    public final int mo60157d() {
        int i = this.f110646e;
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("No TransferType for mode: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        btsb btsb = this.f110643b;
        if (btsb != null) {
            bArr = btsb.mo73642k();
        } else {
            bArr = null;
        }
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.f110653l - 1);
        parcel.writeString(this.f110645d);
        parcel.writeInt(this.f110646e);
        parcel.writeString(this.f110644c);
        parcel.writeParcelable(this.f110647f, i);
        parcel.writeInt(this.f110654m ? 1 : 0);
        parcel.writeInt(this.f110648g ? 1 : 0);
        parcel.writeString(this.f110649h);
        parcel.writeParcelable(this.f110650i, 0);
        parcel.writeInt(this.f110651j ? 1 : 0);
        parcel.writeInt(this.f110652k ? 1 : 0);
    }

    /* renamed from: a */
    private static btsb m94307a(String str, String str2) {
        try {
            return m94315b(beqj.m95435a(str), str2);
        } catch (ParseException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32);
            sb.append("Couldn't parse amount string: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo60154b(String str) {
        Contact contact;
        if (!TextUtils.isEmpty(str)) {
            Contact contact2 = this.f110647f;
            if (contact2 != null) {
                contact = new Contact(contact2.f150662a, contact2.f150663b, contact2.f150664c, str, contact2.f150666e);
            } else {
                contact = Contact.m117179b(str);
            }
            this.f110647f = contact;
        }
    }

    /* renamed from: a */
    private static TransferParams m94308a(int i, boolean z, String str) {
        sdo.m34974b(true);
        return new TransferParams(i, 1, z, null, null, false, str, false);
    }

    /* renamed from: a */
    private static TransferParams m94309a(Context context, int i, int i2, boolean z, btsb btsb, String str, boolean z2, boolean z3) {
        int i3;
        int i4 = i2;
        if (i4 == 3) {
            i3 = i4;
        } else {
            i3 = 2;
        }
        sdo.m34974b(true);
        return new TransferParams(i, i3, z, btsb == null ? m94306a(0, axmh.m82721a(context)) : btsb, str, z2, null, z3);
    }

    /* renamed from: a */
    public static TransferParams m94310a(Context context, Intent intent) {
        boolean z;
        String str;
        String str2;
        btsb btsb;
        int a = bzvi.m126244a(intent.getIntExtra("integrator_id", 0));
        int i = a != 0 ? a : 1;
        if (i == 3 || i == 9) {
            throw new IllegalArgumentException("Explicit Intent cannot specify URL-based IntegratorId");
        }
        if (axog.m82807c(intent) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean booleanExtra = intent.getBooleanExtra("skip_memo_entry", false);
        boolean booleanExtra2 = intent.getBooleanExtra("prepare_transaction", false);
        if (intent.hasExtra("amount_currency")) {
            str = intent.getStringExtra("amount_currency").toUpperCase();
        } else {
            str = null;
        }
        if (intent.hasExtra("amount_in_micros")) {
            if (str == null) {
                str = "USD";
            }
            str2 = str;
            btsb = m94315b(intent.getLongExtra("amount_in_micros", 0), str);
        } else if (str != null) {
            str2 = str;
            btsb = m94315b(0, str);
        } else {
            str2 = str;
            btsb = null;
        }
        int intExtra = intent.getIntExtra("transfer_type", -1);
        if (intExtra == 0) {
            TransferParams a2 = m94309a(context, i, 2, booleanExtra, btsb, str2, z, booleanExtra2);
            a2.m94314a(m94312a(intent));
            a2.f110645d = axog.m82806b(intent);
            return a2;
        } else if (intExtra != 1) {
            String stringExtra = intent.getStringExtra("transaction_token");
            if (stringExtra != null) {
                return m94308a(i, booleanExtra, stringExtra);
            }
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Unrecognized intent: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else {
            TransferParams a3 = m94309a(context, i, 3, booleanExtra, btsb, str2, z, booleanExtra2);
            a3.m94314a(m94312a(intent));
            a3.f110645d = axog.m82806b(intent);
            return a3;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams.a(int, boolean, java.lang.String):com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams
     arg types: [int, int, java.lang.String]
     candidates:
      com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams.a(android.net.Uri, java.lang.String, java.lang.String):java.lang.String
      com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams.a(int, boolean, java.lang.String):com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams */
    /* renamed from: a */
    public static TransferParams m94311a(Context context, Uri uri) {
        String str;
        btsb btsb;
        char c;
        Uri uri2 = uri;
        sdo.m34974b(uri.getPath().startsWith("/r/"));
        String a = m94313a(uri2, "a", "amount");
        String a2 = m94313a(uri2, "c", "currency");
        if (!TextUtils.isEmpty(a) || !TextUtils.isEmpty(a2)) {
            btsb a3 = m94307a(a, a2);
            str = a3.f150178c;
            btsb = a3;
        } else {
            btsb = null;
            str = null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String str2 = pathSegments.get(1);
            switch (str2.hashCode()) {
                case -905768629:
                    if (str2.equals("settle")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3526536:
                    if (str2.equals("send")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3619493:
                    if (str2.equals("view")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 94742588:
                    if (str2.equals("claim")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1095692943:
                    if (str2.equals("request")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str3 = "p";
            if (c == 0) {
                TransferParams a4 = m94309a(context, 9, 3, false, btsb, str, false, false);
                a4.mo60152a(m94313a(uri2, "r", "recipient"));
                a4.mo60154b(m94313a(uri2, str3, "phone"));
                a4.f110645d = m94313a(uri2, "m", "memo");
                return a4;
            } else if (c == 1) {
                TransferParams a5 = m94309a(context, 9, 2, false, btsb, str, false, false);
                a5.mo60152a(m94313a(uri2, "r", "recipient"));
                a5.mo60154b(m94313a(uri2, str3, "phone"));
                a5.f110645d = m94313a(uri2, "m", "memo");
                return a5;
            } else if (c == 2 || c == 3 || c == 4) {
                String queryParameter = uri2.getQueryParameter("tt");
                if (!TextUtils.isEmpty(queryParameter)) {
                    return m94308a(3, false, queryParameter);
                }
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
                sb.append("Path implies transaction specific operation, but no transaction token: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else {
                String str4 = pathSegments.get(1);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 28);
                sb2.append("Unrecognized path segment (");
                sb2.append(str4);
                sb2.append(")");
                throw new axfm(sb2.toString(), uri2);
            }
        } else {
            int size = pathSegments.size();
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("Unexpected number of path segments (");
            sb3.append(size);
            sb3.append(")");
            throw new axfm(sb3.toString(), uri2);
        }
    }

    /* renamed from: a */
    private static TransferData m94312a(Intent intent) {
        if (intent.hasExtra("transfer_data")) {
            return (TransferData) sef.m35076b(intent, "transfer_data", TransferData.CREATOR).get(0);
        }
        String stringExtra = intent.getStringExtra("recipient");
        if (!TextUtils.isEmpty(stringExtra)) {
            return new TransferData(stringExtra, null, 0);
        }
        return null;
    }

    /* renamed from: a */
    private static String m94313a(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str2);
        return queryParameter == null ? uri.getQueryParameter(str) : queryParameter;
    }

    /* renamed from: a */
    private final void m94314a(TransferData transferData) {
        if (transferData == null) {
            return;
        }
        if (!TextUtils.isEmpty(transferData.f110857a)) {
            mo60152a(transferData.f110857a);
        } else if (!TextUtils.isEmpty(transferData.f110858b)) {
            mo60154b(transferData.f110858b);
        } else {
            String valueOf = String.valueOf(transferData);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Invalid recipient: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo60151a(Transaction transaction) {
        boolean z;
        boolean z2 = false;
        if (this.f110650i == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Transaction has already been set");
        if (this.f110649h != null) {
            z2 = true;
        }
        bmxy.m108601b(z2, "Can't set transaction, no transaction token");
        this.f110650i = transaction;
        this.f110643b = m94306a(transaction.f110834d, transaction.f110835e);
        if (transaction.f110832b == 2) {
            int i = transaction.f110831a;
            if (i == 2) {
                this.f110646e = 4;
            } else if (i == 4) {
                this.f110646e = 5;
            }
        }
        if (this.f110646e == 1) {
            this.f110646e = 6;
        }
    }

    /* renamed from: a */
    public final void mo60152a(String str) {
        Contact contact;
        if (!TextUtils.isEmpty(str)) {
            Contact contact2 = this.f110647f;
            if (contact2 != null) {
                contact = new Contact(contact2.f150662a, contact2.f150663b, str, contact2.f150665d, contact2.f150666e);
            } else {
                contact = Contact.m117178a(str);
            }
            this.f110647f = contact;
        }
    }
}
