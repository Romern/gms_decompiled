package p000;

import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;
import com.google.android.wallet.shared.common.ClickSpan;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.SecretKey;

/* renamed from: bkjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkjt extends bkdx implements TextWatcher {

    /* renamed from: a */
    private final ArrayList f124448a = new ArrayList();

    /* renamed from: b */
    private final bjes f124449b = new bjes(1680);

    /* renamed from: c */
    public FormEditText f124450c;

    /* renamed from: d */
    public FormEditText f124451d;

    /* renamed from: e */
    public MaterialFieldLayout f124452e;

    /* renamed from: f */
    public MaterialFieldLayout f124453f;

    /* renamed from: g */
    protected LinearLayout f124454g;

    /* renamed from: h */
    protected View[] f124455h;

    /* renamed from: i */
    public TextView f124456i;

    /* renamed from: j */
    public FormHeaderView f124457j;

    /* renamed from: k */
    public InfoMessageView f124458k;

    /* renamed from: l */
    protected final ArrayList f124459l = new ArrayList();

    /* renamed from: m */
    public boolean f124460m = false;

    /* renamed from: n */
    public String f124461n = "";

    /* renamed from: o */
    public int f124462o = 0;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.internalUicUsernamePasswordRootLayout});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            int a = bmja.m108079a(((bmjb) this.f124069w).f129665c);
            if (a != 0 && a == 4 && (((bmjb) this.f124069w).f129663a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                throw new NullPointerException("Gaia parameters are not specified for gaia form.");
            }
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(resourceId, (ViewGroup) null, false);
            FormHeaderView formHeaderView = (FormHeaderView) viewGroup2.findViewById(C0126R.C0129id.username_password_header);
            this.f124457j = formHeaderView;
            bmdn bmdn = ((bmjb) this.f124069w).f129664b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            formHeaderView.mo71963a(bmdn, layoutInflater, mo65982av(), this.f124448a);
            ViewStub viewStub = (ViewStub) viewGroup2.findViewById(C0126R.C0129id.username_and_password);
            if (viewStub != null) {
                viewStub.inflate();
            }
            FormEditText formEditText = (FormEditText) viewGroup2.findViewById(C0126R.C0129id.username);
            this.f124450c = formEditText;
            formEditText.mo71919a(mo65980at());
            bmjb bmjb = (bmjb) this.f124069w;
            if ((bmjb.f129663a & 16) != 0) {
                bxvd bxvd = (bxvd) bmjb.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bmjb);
                bmqf bmqf = ((bmjb) this.f124069w).f129668f;
                if (bmqf == null) {
                    bmqf = bmqf.f130370r;
                }
                bmqf a2 = bkft.m105629a(bmqf, this.f124450c);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmjb bmjb2 = (bmjb) bxvd.f164949b;
                bmjb bmjb3 = bmjb.f129661l;
                a2.getClass();
                bmjb2.f129668f = a2;
                bmjb2.f129663a |= 16;
                this.f124069w = bxvd.mo74062i();
                this.f124450c.addTextChangedListener(this);
                ArrayList arrayList = this.f124459l;
                bmqf bmqf2 = ((bmjb) this.f124069w).f129668f;
                if (bmqf2 == null) {
                    bmqf2 = bmqf.f130370r;
                }
                long j = bmqf2.f130376e;
                FormEditText formEditText2 = this.f124450c;
                bmqf bmqf3 = ((bmjb) this.f124069w).f129668f;
                if (bmqf3 == null) {
                    bmqf3 = bmqf.f130370r;
                }
                arrayList.add(new bkde(j, formEditText2, bkft.m105642b(bmqf3)));
            }
            FormEditText formEditText3 = this.f124450c;
            if ((((bmjb) this.f124069w).f129663a & 16) == 0) {
                i = 8;
            } else {
                i = 0;
            }
            formEditText3.setVisibility(i);
            MaterialFieldLayout materialFieldLayout = (MaterialFieldLayout) viewGroup2.findViewById(C0126R.C0129id.username_container);
            this.f124452e = materialFieldLayout;
            if (materialFieldLayout != null) {
                if ((((bmjb) this.f124069w).f129663a & 16) != 0) {
                    materialFieldLayout.setVisibility(0);
                    this.f124452e.mo72052c();
                } else {
                    materialFieldLayout.setVisibility(8);
                }
            }
            FormEditText formEditText4 = (FormEditText) viewGroup2.findViewById(C0126R.C0129id.password);
            this.f124451d = formEditText4;
            formEditText4.mo71919a(mo65980at());
            bmjb bmjb4 = (bmjb) this.f124069w;
            bxvd bxvd2 = (bxvd) bmjb4.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bmjb4);
            bmqf bmqf4 = ((bmjb) this.f124069w).f129669g;
            if (bmqf4 == null) {
                bmqf4 = bmqf.f130370r;
            }
            bmqf a3 = bkft.m105629a(bmqf4, this.f124451d);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bmjb bmjb5 = (bmjb) bxvd2.f164949b;
            bmjb bmjb6 = bmjb.f129661l;
            a3.getClass();
            bmjb5.f129669g = a3;
            bmjb5.f129663a |= 32;
            this.f124069w = bxvd2.mo74062i();
            int a4 = bmja.m108079a(((bmjb) this.f124069w).f129665c);
            if (a4 != 0 && a4 == 4) {
                this.f124451d.mo65972a((bkgj) new bkjs(this));
            }
            this.f124451d.addTextChangedListener(this);
            ArrayList arrayList2 = this.f124459l;
            bmqf bmqf5 = ((bmjb) this.f124069w).f129669g;
            if (bmqf5 == null) {
                bmqf5 = bmqf.f130370r;
            }
            long j2 = bmqf5.f130376e;
            FormEditText formEditText5 = this.f124451d;
            bmqf bmqf6 = ((bmjb) this.f124069w).f129669g;
            if (bmqf6 == null) {
                bmqf6 = bmqf.f130370r;
            }
            arrayList2.add(new bkde(j2, formEditText5, bkft.m105642b(bmqf6)));
            MaterialFieldLayout materialFieldLayout2 = (MaterialFieldLayout) viewGroup2.findViewById(C0126R.C0129id.password_container);
            this.f124453f = materialFieldLayout2;
            if (materialFieldLayout2 != null) {
                materialFieldLayout2.mo72052c();
            }
            this.f124454g = (LinearLayout) viewGroup2.findViewById(C0126R.C0129id.ui_fields_container);
            this.f124455h = new View[((bmjb) this.f124069w).f129672j.size()];
            mo53000a(layoutInflater, (bmqf[]) ((bmjb) this.f124069w).f129672j.toArray(new bmqf[0]));
            this.f124456i = (TextView) viewGroup2.findViewById(C0126R.C0129id.login_help_text);
            if (((bmjb) this.f124069w).f129670h.isEmpty()) {
                this.f124456i.setVisibility(8);
            } else {
                ClickSpan.m118372a(this.f124456i, ((bmjb) this.f124069w).f129670h, this, ((Boolean) bjwe.f123474I.mo54082a()).booleanValue());
                C1280ps.m19894a(this.f124456i, new bkgg(this.f124456i));
            }
            InfoMessageView infoMessageView = (InfoMessageView) viewGroup2.findViewById(C0126R.C0129id.legal_message_text);
            this.f124458k = infoMessageView;
            infoMessageView.f152084h = mo65982av();
            bmjb bmjb7 = (bmjb) this.f124069w;
            if ((bmjb7.f129663a & 128) != 0) {
                InfoMessageView infoMessageView2 = this.f124458k;
                bmjf bmjf = bmjb7.f129671i;
                if (bmjf == null) {
                    bmjf = bmjf.f129685i;
                }
                bmnr bmnr = bmjf.f129689c;
                if (bmnr == null) {
                    bmnr = bmnr.f130153o;
                }
                infoMessageView2.mo72003a(bmnr);
                this.f124448a.add(this.f124458k);
            } else {
                this.f124458k.setVisibility(8);
            }
            return viewGroup2;
        }
        throw new IllegalArgumentException("Attribute internalUicUsernamePasswordRootLayout must be defined.");
    }

    public final void afterTextChanged(Editable editable) {
        mo51905a(1, Bundle.EMPTY);
        this.f124460m = false;
        this.f124461n = "";
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        FormEditText formEditText;
        FormEditText formEditText2;
        mo65884y();
        return ((((bmjb) this.f124069w).f129663a & 16) == 0 || ((formEditText2 = this.f124450c) != null && !TextUtils.isEmpty(formEditText2.getText()))) && (formEditText = this.f124451d) != null && !TextUtils.isEmpty(formEditText.getText());
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f124448a;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f124459l;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f124449b;
    }

    /* renamed from: f */
    public void mo51922f() {
        if (this.f124450c != null) {
            boolean z = this.f124195aJ;
            this.f124457j.setEnabled(z);
            this.f124450c.setEnabled(z);
            this.f124451d.setEnabled(z);
            for (View view : this.f124455h) {
                view.setEnabled(z);
            }
            this.f124458k.setEnabled(z);
            this.f124456i.setEnabled(z);
        }
    }

    /* renamed from: m */
    public final boolean mo66099m() {
        int a = bmja.m108079a(((bmjb) this.f124069w).f129665c);
        return a != 0 && a == 4 && !this.f124460m;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hasCompletedPasswordVerification", this.f124460m);
        bundle.putString("reauthToken", this.f124461n);
        bundle.putInt("reauthResponseCode", this.f124462o);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        mo51905a(6, Bundle.EMPTY);
        if (bundle != null) {
            this.f124460m = bundle.getBoolean("hasCompletedPasswordVerification");
            this.f124461n = bundle.getString("reauthToken");
            this.f124462o = bundle.getInt("reauthResponseCode");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmjb.f129661l.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmjb) this.f124069w).f129664b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: t */
    public final bmjc mo66101t() {
        int i;
        bxvd da = bmjc.f129674i.mo74144da();
        bmjb bmjb = (bmjb) this.f124069w;
        int i2 = 1;
        if ((bmjb.f129663a & 1) != 0) {
            bmdn bmdn = bmjb.f129664b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            ByteString bxtx = bmdn.f128836d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmjc bmjc = (bmjc) da.f164949b;
            bxtx.getClass();
            bmjc.f129676a |= 32;
            bmjc.f129683h = bxtx;
        }
        bmjb bmjb2 = (bmjb) this.f124069w;
        if ((bmjb2.f129663a & 16) != 0) {
            FormEditText formEditText = this.f124450c;
            bmqf bmqf = bmjb2.f129668f;
            if (bmqf == null) {
                bmqf = bmqf.f130370r;
            }
            bmqk a = bkft.m105631a(formEditText, bmqf);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmjc bmjc2 = (bmjc) da.f164949b;
            a.getClass();
            bmjc2.f129677b = a;
            bmjc2.f129676a |= 1;
            i = 0;
        } else {
            i = 0;
        }
        while (i < ((bmjb) this.f124069w).f129672j.size()) {
            bmqk a2 = bkft.m105631a(this.f124455h[i], (bmqf) ((bmjb) this.f124069w).f129672j.get(i));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmjc bmjc3 = (bmjc) da.f164949b;
            a2.getClass();
            if (!bmjc3.f129679d.mo73666a()) {
                bmjc3.f129679d = GeneratedMessageLite.m124021a(bmjc3.f129679d);
            }
            bmjc3.f129679d.add(a2);
            i++;
        }
        bxvd da2 = bmqk.f130403g.mo74144da();
        bmqf bmqf2 = ((bmjb) this.f124069w).f129669g;
        if (bmqf2 == null) {
            bmqf2 = bmqf.f130370r;
        }
        if ((bmqf2.f130372a & 1) != 0) {
            bmqf bmqf3 = ((bmjb) this.f124069w).f129669g;
            if (bmqf3 == null) {
                bmqf3 = bmqf.f130370r;
            }
            if (!bmqf3.f130375d.isEmpty()) {
                bmqf bmqf4 = ((bmjb) this.f124069w).f129669g;
                if (bmqf4 == null) {
                    bmqf4 = bmqf.f130370r;
                }
                String str = bmqf4.f130375d;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmqk bmqk = (bmqk) da2.f164949b;
                str.getClass();
                bmqk.f130405a |= 1;
                bmqk.f130408d = str;
            }
        }
        int a3 = bmja.m108079a(((bmjb) this.f124069w).f129665c);
        if (a3 == 0) {
            a3 = 1;
        }
        int i3 = a3 - 1;
        if (i3 == 1) {
            String obj = this.f124451d.getText().toString();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmqk bmqk2 = (bmqk) da2.f164949b;
            obj.getClass();
            bmqk2.f130406b = 2;
            bmqk2.f130407c = obj;
        } else if (i3 == 2) {
            bjvo bjvo = new bjvo(getActivity(), ((bmjb) this.f124069w).f129667e);
            try {
                byte[] k = ((bmjb) this.f124069w).f129666d.getKey();
                String obj2 = this.f124451d.getText().toString();
                String str2 = bjvo.f123395a;
                long currentTimeMillis = System.currentTimeMillis();
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(k));
                byte[] byteArray = x509Certificate.getSerialNumber().toByteArray();
                int length = byteArray.length;
                if (length < 8) {
                    byte[] bArr = new byte[8];
                    System.arraycopy(byteArray, 0, bArr, 8 - length, length);
                    byteArray = bArr;
                } else if (length != 8) {
                    byte[] bArr2 = new byte[8];
                    System.arraycopy(byteArray, length - 8, bArr2, 0, 8);
                    byteArray = bArr2;
                }
                SecretKey a4 = bjvo.m104725a();
                byte[] a5 = bjvo.m104726a(x509Certificate, a4);
                int i4 = (int) (currentTimeMillis / 1000);
                byte[] bytes = str2.getBytes("UTF-8");
                int length2 = bytes.length;
                if (length2 != str2.length()) {
                    int length3 = str2.length();
                    StringBuilder sb = new StringBuilder(61);
                    sb.append("Hashed device ID not 8 bits per char: ");
                    sb.append(length2);
                    sb.append(" ");
                    sb.append(length3);
                    throw new IllegalArgumentException(sb.toString());
                } else if (length2 <= 255) {
                    byte[] bytes2 = obj2.getBytes("UTF-16LE");
                    int length4 = obj2.length();
                    if (length4 <= 255) {
                        ByteBuffer allocate = ByteBuffer.allocate(length2 + 6 + bytes2.length);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i4);
                        allocate.put((byte) length2);
                        allocate.put(bytes);
                        allocate.put((byte) length4);
                        allocate.put(bytes2);
                        byte[] a6 = bjvo.m104727a(a4, allocate.array());
                        int length5 = a5.length + a6.length;
                        if (length5 <= 65535) {
                            ByteBuffer allocate2 = ByteBuffer.allocate(byteArray.length + 4 + length5);
                            allocate2.order(ByteOrder.BIG_ENDIAN);
                            allocate2.putShort(5);
                            allocate2.put(byteArray);
                            allocate2.putChar((char) length5);
                            allocate2.put(a5);
                            allocate2.put(a6);
                            String encodeToString = Base64.encodeToString(allocate2.array(), 2);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bmqk bmqk3 = (bmqk) da2.f164949b;
                            encodeToString.getClass();
                            bmqk3.f130406b = 2;
                            bmqk3.f130407c = encodeToString;
                            String str3 = bjvo.f123395a;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmjc bmjc4 = (bmjc) da.f164949b;
                            str3.getClass();
                            bmjc4.f129676a |= 4;
                            bmjc4.f129680e = str3;
                        } else {
                            StringBuilder sb2 = new StringBuilder(42);
                            sb2.append("Encrypted message is too long: ");
                            sb2.append(length5);
                            throw new IllegalStateException(sb2.toString());
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder(30);
                        sb3.append("Password too long: ");
                        sb3.append(length4);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder(38);
                    sb4.append("Hashed device ID too long: ");
                    sb4.append(length2);
                    throw new IllegalArgumentException(sb4.toString());
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            } catch (CertificateException e3) {
                throw new IllegalStateException("Unable to encrypt user PayPal credentials", e3);
            }
        } else if (i3 != 3) {
            int a7 = bmja.m108079a(((bmjb) this.f124069w).f129665c);
            if (a7 != 0) {
                i2 = a7;
            }
            StringBuilder sb5 = new StringBuilder(40);
            sb5.append("Unsupported encryption type: ");
            sb5.append(i2 - 1);
            throw new IllegalArgumentException(sb5.toString());
        } else {
            String str4 = this.f124461n;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmqk bmqk4 = (bmqk) da2.f164949b;
            str4.getClass();
            bmqk4.f130406b = 2;
            bmqk4.f130407c = str4;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmjc bmjc5 = (bmjc) da.f164949b;
        bmqk bmqk5 = (bmqk) da2.mo74062i();
        bmqk5.getClass();
        bmjc5.f129678c = bmqk5;
        bmjc5.f129676a |= 2;
        int a8 = bmja.m108079a(((bmjb) this.f124069w).f129665c);
        int i5 = a8 != 0 ? a8 : 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmjc bmjc6 = (bmjc) da.f164949b;
        bmjc6.f129681f = i5 - 1;
        bmjc6.f129676a |= 8;
        bmjb bmjb3 = (bmjb) this.f124069w;
        if ((bmjb3.f129663a & 128) != 0) {
            bmjf bmjf = bmjb3.f129671i;
            if (bmjf == null) {
                bmjf = bmjf.f129685i;
            }
            String str5 = bmjf.f129693g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmjc bmjc7 = (bmjc) da.f164949b;
            str5.getClass();
            bmjc7.f129676a |= 16;
            bmjc7.f129682g = str5;
        }
        return (bmjc) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53000a(LayoutInflater layoutInflater, bmqf[] bmqfArr) {
        for (int i = 0; i < bmqfArr.length; i++) {
            this.f124455h[i] = new bkfu(bmqfArr[i], layoutInflater, mo65818aq(), this.f124454g).mo65971a();
            this.f124454g.addView(this.f124455h[i]);
            this.f124459l.add(new bkde(bmqfArr[i].f130376e, this.f124455h[i], bkft.m105642b((bmqf) ((bmjb) this.f124069w).f129672j.get(i))));
        }
    }

    /* renamed from: a */
    public final void mo52355a(View view, String str) {
        if (view == this.f124456i) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } else {
            super.mo52355a(view, str);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void */
    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        String str = bmaf.f128438a;
        bmdn bmdn = ((bmjb) this.f124069w).f129664b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (!str.equals(bmdn.f128834b)) {
            return false;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        int i = bmaf2.f128439b;
        if (i == 1) {
            this.f124450c.mo65794a((CharSequence) bmas.f128497b, true);
        } else if (i != 2) {
            bmaf bmaf3 = bmas.f128496a;
            if (bmaf3 == null) {
                bmaf3 = bmaf.f128436d;
            }
            int i2 = bmaf3.f128439b;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unknown FormFieldMessage fieldId: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            this.f124451d.mo65794a((CharSequence) bmas.f128497b, true);
        }
        return true;
    }
}
