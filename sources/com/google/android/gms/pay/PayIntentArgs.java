package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PayIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfr();

    /* renamed from: a */
    public Account f81552a;

    /* renamed from: b */
    public FopDetailIntentArgs f81553b;

    /* renamed from: c */
    public TransactionDetailIntentArgs f81554c;

    /* renamed from: d */
    public TransactionListIntentArgs f81555d;

    /* renamed from: e */
    public ClosedLoopCardIntentArgs f81556e;

    /* renamed from: f */
    public TransitDisplayCardIntentArgs f81557f;

    /* renamed from: g */
    public SaveTicketCentricIntentArgs f81558g;

    /* renamed from: h */
    public PaycacheSetupIntentArgs f81559h;

    /* renamed from: i */
    public TopUpIntentArgs f81560i;

    /* renamed from: j */
    public ValuableDetailIntentArgs f81561j;

    /* renamed from: k */
    public HomeIntentArgs f81562k;

    public PayIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayIntentArgs) {
            PayIntentArgs payIntentArgs = (PayIntentArgs) obj;
            return sdg.m34949a(this.f81552a, payIntentArgs.f81552a) && sdg.m34949a(this.f81553b, payIntentArgs.f81553b) && sdg.m34949a(this.f81554c, payIntentArgs.f81554c) && sdg.m34949a(this.f81555d, payIntentArgs.f81555d) && sdg.m34949a(this.f81556e, payIntentArgs.f81556e) && sdg.m34949a(this.f81557f, payIntentArgs.f81557f) && sdg.m34949a(this.f81558g, payIntentArgs.f81558g) && sdg.m34949a(this.f81559h, payIntentArgs.f81559h) && sdg.m34949a(this.f81560i, payIntentArgs.f81560i) && sdg.m34949a(this.f81561j, payIntentArgs.f81561j) && sdg.m34949a(this.f81562k, payIntentArgs.f81562k);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81552a, this.f81553b, this.f81554c, this.f81555d, this.f81556e, this.f81557f, this.f81558g, this.f81559h, this.f81560i, this.f81561j, this.f81562k});
    }

    public PayIntentArgs(Account account, FopDetailIntentArgs fopDetailIntentArgs, TransactionDetailIntentArgs transactionDetailIntentArgs, TransactionListIntentArgs transactionListIntentArgs, ClosedLoopCardIntentArgs closedLoopCardIntentArgs, TransitDisplayCardIntentArgs transitDisplayCardIntentArgs, SaveTicketCentricIntentArgs saveTicketCentricIntentArgs, PaycacheSetupIntentArgs paycacheSetupIntentArgs, TopUpIntentArgs topUpIntentArgs, ValuableDetailIntentArgs valuableDetailIntentArgs, HomeIntentArgs homeIntentArgs) {
        this.f81552a = account;
        this.f81553b = fopDetailIntentArgs;
        this.f81554c = transactionDetailIntentArgs;
        this.f81555d = transactionListIntentArgs;
        this.f81556e = closedLoopCardIntentArgs;
        this.f81557f = transitDisplayCardIntentArgs;
        this.f81558g = saveTicketCentricIntentArgs;
        this.f81559h = paycacheSetupIntentArgs;
        this.f81560i = topUpIntentArgs;
        this.f81561j = valuableDetailIntentArgs;
        this.f81562k = homeIntentArgs;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81552a, i, false);
        see.m35040a(parcel, 2, this.f81553b, i, false);
        see.m35040a(parcel, 3, this.f81554c, i, false);
        see.m35040a(parcel, 4, this.f81555d, i, false);
        see.m35040a(parcel, 5, this.f81556e, i, false);
        see.m35040a(parcel, 6, this.f81557f, i, false);
        see.m35040a(parcel, 7, this.f81558g, i, false);
        see.m35040a(parcel, 8, this.f81559h, i, false);
        see.m35040a(parcel, 9, this.f81560i, i, false);
        see.m35040a(parcel, 10, this.f81561j, i, false);
        see.m35040a(parcel, 11, this.f81562k, i, false);
        see.m35062b(parcel, a);
    }
}
