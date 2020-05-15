package com.google.android.gms.auth.uiflows.gettoken;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.ErrorChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import com.google.android.gms.auth.uiflows.consent.BrowserConsentChimeraActivity;
import com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetTokenController implements Controller {
    public static final Parcelable.Creator CREATOR = new jya();

    /* renamed from: a */
    private static final sek f11519a = ght.m13171a("GetToken", "GetTokenController");

    /* renamed from: b */
    private final Context f11520b;

    /* renamed from: c */
    private final imw f11521c;

    /* renamed from: d */
    private final ily f11522d = ((ily) ily.f21320d.mo13145b());

    /* renamed from: e */
    private final AccountAuthenticatorResponse f11523e;

    /* renamed from: f */
    private final Account f11524f;

    /* renamed from: g */
    private final TokenRequest f11525g;

    /* renamed from: h */
    private final boolean f11526h;

    /* renamed from: i */
    private final boolean f11527i;

    /* renamed from: j */
    private final rrq f11528j;

    /* renamed from: k */
    private int f11529k;

    public GetTokenController(AccountAuthenticatorResponse accountAuthenticatorResponse, TokenRequest tokenRequest, boolean z, boolean z2, rrq rrq, int i) {
        rpr b = rpr.m34216b();
        imw imw = new imw(rpr.m34216b());
        rpr.m34216b().getPackageManager();
        this.f11520b = b;
        this.f11521c = imw;
        this.f11523e = accountAuthenticatorResponse;
        sdo.m34959a(tokenRequest);
        this.f11525g = tokenRequest;
        Account a = tokenRequest.mo7637a();
        sdo.m34959a(a);
        this.f11524f = a;
        this.f11526h = z;
        this.f11527i = z2;
        this.f11528j = rrq;
        this.f11529k = i;
    }

    /* renamed from: a */
    private final Intent m7066a(ims ims, izj izj) {
        String str;
        boolean booleanValue = ((Boolean) ims.mo13147a(GetTokenChimeraActivity.f11516b, false)).booleanValue();
        if (cbxi.f178510a.mo6606a().mo75574b()) {
            str = izj.f22000ac;
        } else {
            str = "dmStatus";
        }
        return rrk.m34291a(this.f11520b, this.f11524f, false, this.f11527i, this.f11528j.mo25045a(), false, null, true, str, booleanValue, 1, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final String mo7863b() {
        return "GetTokenController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11523e, 0);
        parcel.writeParcelable(this.f11525g, 0);
        parcel.writeByte(this.f11526h ? (byte) 1 : 0);
        parcel.writeByte(this.f11527i ? (byte) 1 : 0);
        parcel.writeParcelable(this.f11528j.mo25045a(), 0);
        parcel.writeInt(this.f11529k);
    }

    /* renamed from: a */
    private final jxw m7067a(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11523e;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return jxw.m17486b(0, putExtra);
    }

    /* renamed from: a */
    public final jxw mo7862a(jxy jxy) {
        Bundle bundle;
        jxy jxy2 = jxy;
        if (jxy2 != null) {
            f11519a.mo25412b(String.format("Result with id=%d and resultCode=%d", Integer.valueOf(jxy2.f23499a), Integer.valueOf(jxy2.f23500b)), new Object[0]);
            Intent intent = jxy2.f23501c;
            if (intent == null) {
                bundle = new Bundle();
            } else {
                bundle = intent.getExtras();
            }
            new ims(bundle);
            int i = jxy2.f23499a;
            if (i == 10) {
                int i2 = jxy2.f23500b;
                if (i2 == -1) {
                    ims ims = new ims(jxy2.f23501c.getExtras());
                    TokenResponse tokenResponse = (TokenResponse) ims.mo13146a(GetTokenChimeraActivity.f11515a);
                    if (tokenResponse == null) {
                        f11519a.mo25416d("Unable to get token", new Object[0]);
                        return m7067a(5, "token response is null");
                    }
                    izj b = tokenResponse.mo7647b();
                    if (b != izj.SUCCESS || TextUtils.isEmpty(tokenResponse.f10727d)) {
                        int ordinal = b.ordinal();
                        if (ordinal != 1) {
                            if (ordinal != 8) {
                                if (ordinal != 20) {
                                    if (ordinal != 21) {
                                        switch (ordinal) {
                                            case 27:
                                            case 28:
                                            case 29:
                                            case 30:
                                            case 31:
                                            case 32:
                                            case 33:
                                            case 35:
                                                break;
                                            case 34:
                                                if (gnv.m13496F()) {
                                                    return jxw.m17484a(33, DmSetScreenlockChimeraActivity.m6961a(this.f11520b, this.f11524f, this.f11527i, this.f11528j));
                                                }
                                                if (this.f11529k < 32) {
                                                    Intent a = m7066a(ims, b);
                                                    if (a == null) {
                                                        return m7067a(6, "device management not supported");
                                                    }
                                                    return jxw.m17484a(32, WrapperControlledChimeraActivity.m7009a(this.f11520b, this.f11527i, this.f11528j, a));
                                                }
                                                break;
                                            default:
                                                sek sek = f11519a;
                                                String valueOf = String.valueOf(b);
                                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                                                sb.append("Unexpected status in token response: ");
                                                sb.append(valueOf);
                                                sek.mo25416d(sb.toString(), new Object[0]);
                                                return m7067a(5, b.f22000ac);
                                        }
                                    } else {
                                        ResolutionData resolutionData = tokenResponse.f10749z;
                                        if (resolutionData != null && resolutionData.f9933c == 2) {
                                            return jxw.m17484a(40, BrowserConsentChimeraActivity.m7045a(this.f11520b, this.f11524f, resolutionData.f9934d, resolutionData.f9935e, this.f11528j));
                                        }
                                    }
                                } else if (this.f11529k < 40) {
                                    gic a2 = gic.m13182a(this.f11525g.mo7640b());
                                    boolean d = a2.mo11905d();
                                    String c = a2.mo11904c();
                                    TokenRequest tokenRequest = this.f11525g;
                                    AppDescription appDescription = tokenRequest.f10714j;
                                    return jxw.m17484a(40, GrantCredentialsWithAclChimeraActivity.m7052a(appDescription.f10841e, appDescription.f10838b, tokenRequest.f10706b, this.f11524f.name, ilt.m15674a(tokenResponse.mo7648c()), tokenResponse.f10741r, tokenResponse.f10742s, tokenResponse.f10748y, !d, c));
                                }
                            } else if (this.f11529k < 20) {
                                if (this.f11522d.mo13131a(this.f11524f)) {
                                    return jxw.m17485a(22, ErrorChimeraActivity.m6967a(this.f11520b, (int) C0126R.string.auth_get_token_bad_auth_work_service_account_title, (int) C0126R.string.auth_get_token_bad_auth_work_service_account_message), 0, 0);
                                }
                                Context context = this.f11520b;
                                Account account = this.f11524f;
                                return jxw.m17485a(20, MinuteMaidChimeraActivity.m7074b(context, account, this.f11527i, this.f11528j, jvj.m17398a(context, true, account.type, this.f11528j, false)), 0, 0);
                            }
                            return m7067a(5, "something went wrong");
                        }
                        if (this.f11529k < 32) {
                            Intent a3 = m7066a(ims, b);
                            if (a3 == null) {
                                return m7067a(6, "device management not supported");
                            }
                            return jxw.m17484a(32, WrapperControlledChimeraActivity.m7009a(this.f11520b, this.f11527i, this.f11528j, a3));
                        }
                        return m7067a(5, "something went wrong");
                    }
                    if (!this.f11524f.equals(tokenResponse.f10744u)) {
                        f11519a.mo25416d(String.format("Account in TokenResponse does not match! Expected %s but got %s.", this.f11524f, tokenResponse.f10744u), new Object[0]);
                    }
                    Intent putExtra = new Intent().putExtra("authAccount", tokenResponse.f10744u.name).putExtra("accountType", tokenResponse.f10744u.type).putExtra("authtoken", tokenResponse.f10727d);
                    AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11523e;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onResult(putExtra.getExtras());
                    }
                    return jxw.m17486b(-1, putExtra);
                } else if (i2 == 0) {
                    return m7067a(4, "user canceled");
                }
            } else if (i == 40) {
                this.f11529k = 40;
                int i3 = jxy2.f23500b;
                if (i3 == -1) {
                    ConsentResult consentResult = (ConsentResult) jxy2.f23501c.getParcelableExtra(ConsentResult.f10615a);
                    izj a4 = consentResult.mo7619a();
                    if (a4 != izj.SUCCESS) {
                        sek sek2 = f11519a;
                        String valueOf2 = String.valueOf(a4);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                        sb2.append("Unexpected status in grant credentials response: ");
                        sb2.append(valueOf2);
                        sek2.mo25416d(sb2.toString(), new Object[0]);
                        return m7067a(5, a4.f22000ac);
                    }
                    TokenRequest tokenRequest2 = this.f11525g;
                    tokenRequest2.f10709e = consentResult.f10619e;
                    PACLConfig pACLConfig = tokenRequest2.f10710f;
                    String str = consentResult.f10618d;
                    PACLConfig pACLConfig2 = null;
                    String str2 = null;
                    if (str != null) {
                        if (pACLConfig != null) {
                            str2 = pACLConfig.f10878b;
                        }
                        pACLConfig2 = new PACLConfig(str2, str);
                    }
                    TokenRequest tokenRequest3 = this.f11525g;
                    tokenRequest3.f10710f = pACLConfig2;
                    tokenRequest3.mo7639a(consentResult.mo7620b());
                    TokenRequest tokenRequest4 = this.f11525g;
                    tokenRequest4.f10721q = consentResult.f10621g;
                    tokenRequest4.f10722r = consentResult.f10622h;
                    return jxw.m17484a(10, GetTokenChimeraActivity.m7063a(this.f11520b, tokenRequest4, this.f11526h, this.f11527i, this.f11528j));
                } else if (i3 == 0) {
                    return m7067a(4, "user declined");
                }
            } else if (i == 1001) {
                return m7067a(3, "no network");
            } else {
                if (i == 32) {
                    this.f11529k = 32;
                    switch (jxy2.f23500b) {
                        case 2:
                        case 7:
                        case 8:
                            return m7067a(5, "something went wrong");
                        case 3:
                            return m7067a(3, "dm agent data fetch error");
                        case 4:
                            return m7067a(3, "dm agent download install error");
                        case 5:
                        case 9:
                            return m7067a(6, "device management not supported");
                        case 6:
                            return m7067a(4, "user canceled");
                        default:
                            return jxw.m17484a(10, GetTokenChimeraActivity.m7063a(this.f11520b, this.f11525g, this.f11526h, this.f11527i, this.f11528j));
                    }
                } else if (i != 33) {
                    switch (i) {
                        case 20:
                            this.f11529k = 20;
                            int i4 = jxy2.f23500b;
                            if (i4 == -1) {
                                ims ims2 = new ims(jxy2.f23501c.getExtras());
                                String str3 = (String) ims2.mo13146a(MinuteMaidChimeraActivity.f11546b);
                                String str4 = (String) ims2.mo13146a(MinuteMaidChimeraActivity.f11548d);
                                if (this.f11524f != null && !TextUtils.isEmpty(str4) && !this.f11524f.name.equalsIgnoreCase(str4)) {
                                    new grk(this.f11520b).mo12133a(8);
                                }
                                return jxw.m17485a(21, UpdateCredentialsChimeraActivity.m7035a(this.f11520b, this.f11524f, str3, this.f11527i, this.f11528j), 0, 0);
                            } else if (i4 == 0) {
                                return m7067a(4, "user did not reauth");
                            } else {
                                if (i4 == 2) {
                                    return m7067a(5, "something went wrong");
                                }
                            }
                            break;
                        case 21:
                            this.f11529k = 21;
                            int i5 = jxy2.f23500b;
                            if (i5 == -1) {
                                return jxw.m17485a(10, GetTokenChimeraActivity.m7063a(this.f11520b, this.f11525g, this.f11526h, this.f11527i, this.f11528j), 0, 0);
                            }
                            if (i5 == 0) {
                                return m7067a(5, "something went wrong");
                            }
                            break;
                        case 22:
                            this.f11529k = 22;
                            return m7067a(6, "work service account");
                    }
                } else {
                    this.f11529k = 33;
                    if (jxy2.f23500b == -1) {
                        return jxw.m17484a(10, GetTokenChimeraActivity.m7063a(this.f11520b, this.f11525g, this.f11526h, this.f11527i, this.f11528j));
                    }
                    return m7067a(4, "missing lock screen");
                }
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(jxy2.f23500b)));
        } else if (this.f11521c.mo13150a()) {
            return jxw.m17484a(10, GetTokenChimeraActivity.m7063a(this.f11520b, this.f11525g, this.f11526h, this.f11527i, this.f11528j));
        } else {
            ims ims3 = new ims();
            ims3.mo13148b(jwz.f23429j, Boolean.valueOf(this.f11527i));
            ims3.mo13148b(jwz.f23428i, this.f11528j.mo25045a());
            return jxw.m17484a(1001, ErrorChimeraActivity.m6967a(this.f11520b, (int) C0126R.string.common_no_network, (int) C0126R.string.auth_error_no_network).putExtras(ims3.f21367a));
        }
    }
}
