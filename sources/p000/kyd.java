package p000;

import android.content.Context;
import android.net.Uri;
import com.google.autofill.detection.p098ml.ModelConfig;
import com.google.autofill.detection.p098ml.NeuralNetwork;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: kyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kyd implements kyo {

    /* renamed from: a */
    private static final srn f25392a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    private final lhi f25393b;

    /* renamed from: c */
    private ModelConfig f25394c = null;

    /* renamed from: d */
    private Uri f25395d = null;

    /* renamed from: e */
    private ByteBuffer f25396e = null;

    /* renamed from: f */
    private Uri f25397f = null;

    /* renamed from: g */
    private final kyc f25398g;

    public kyd(lhi lhi, Context context) {
        kyc kyc = new kyc(context);
        this.f25393b = lhi;
        this.f25398g = kyc;
    }

    /* renamed from: a */
    private final ModelConfig m18768a(bmxv bmxv) {
        InputStream a;
        if (!bmxv.mo66813a()) {
            m18770c();
            return null;
        }
        Uri uri = (Uri) bmxv.mo66814b();
        Uri uri2 = this.f25395d;
        if (uri2 != null && this.f25394c != null && uri.compareTo(uri2) == 0) {
            return this.f25394c;
        }
        m18770c();
        try {
            a = this.f25398g.mo14938a(uri);
            if (a == null) {
                return null;
            }
            ModelConfig parseFrom = ModelConfig.parseFrom(a);
            this.f25394c = parseFrom;
            this.f25395d = uri;
            a.close();
            return parseFrom;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f25392a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("kyd", "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to load model config from content resolver.");
            return null;
        } catch (blma | blmh e2) {
            bnsl bnsl2 = (bnsl) f25392a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("kyd", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to instantiate model config from content resolver.");
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private final NeuralNetwork m18769b(bmxv bmxv) {
        InputStream a;
        if (!bmxv.mo66813a()) {
            m18771d();
            return null;
        }
        Uri uri = (Uri) bmxv.mo66814b();
        Uri uri2 = this.f25397f;
        if (uri2 != null && this.f25396e != null && uri.compareTo(uri2) == 0) {
            return NeuralNetwork.createFromFlatBuffer(this.f25396e);
        }
        m18771d();
        try {
            a = this.f25398g.mo14938a(uri);
            if (a == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            boav.m111013a(a, byteArrayOutputStream);
            ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            NeuralNetwork createFromFlatBuffer = NeuralNetwork.createFromFlatBuffer(wrap);
            this.f25396e = wrap;
            this.f25397f = uri;
            a.close();
            return createFromFlatBuffer;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f25392a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("kyd", "b", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to load neural network from content resolver.");
            return null;
        } catch (RuntimeException e2) {
            bnsl bnsl2 = (bnsl) f25392a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("kyd", "b", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to instantiate neural network from content resolver.");
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    private final void m18770c() {
        this.f25394c = null;
        this.f25395d = null;
    }

    /* renamed from: d */
    private final void m18771d() {
        this.f25396e = null;
        this.f25397f = null;
    }

    /* renamed from: a */
    public final kyn mo14939a() {
        ModelConfig modelConfig;
        InputStream a;
        InputStream a2;
        lhh j = this.f25393b.mo15090j();
        bmxv a3 = j.mo15075a();
        NeuralNetwork neuralNetwork = null;
        if (!a3.mo66813a()) {
            m18770c();
            modelConfig = null;
        } else {
            Uri uri = (Uri) a3.mo66814b();
            Uri uri2 = this.f25395d;
            if (uri2 == null || this.f25394c == null || uri.compareTo(uri2) != 0) {
                m18770c();
                try {
                    a2 = this.f25398g.mo14938a(uri);
                    if (a2 != null) {
                        ModelConfig parseFrom = ModelConfig.parseFrom(a2);
                        this.f25394c = parseFrom;
                        this.f25395d = uri;
                        a2.close();
                        modelConfig = parseFrom;
                    } else {
                        modelConfig = null;
                    }
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) f25392a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("kyd", "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to load model config from content resolver.");
                    modelConfig = null;
                } catch (blma | blmh e2) {
                    bnsl bnsl2 = (bnsl) f25392a.mo68388c();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68432a("kyd", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to instantiate model config from content resolver.");
                    modelConfig = null;
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } else {
                modelConfig = this.f25394c;
            }
        }
        bmxv b = j.mo15076b();
        if (!b.mo66813a()) {
            m18771d();
        } else {
            Uri uri3 = (Uri) b.mo66814b();
            Uri uri4 = this.f25397f;
            if (uri4 == null || this.f25396e == null || uri3.compareTo(uri4) != 0) {
                m18771d();
                try {
                    a = this.f25398g.mo14938a(uri3);
                    if (a != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        boav.m111013a(a, byteArrayOutputStream);
                        ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                        NeuralNetwork createFromFlatBuffer = NeuralNetwork.createFromFlatBuffer(wrap);
                        this.f25396e = wrap;
                        this.f25397f = uri3;
                        a.close();
                        neuralNetwork = createFromFlatBuffer;
                    }
                } catch (IOException e3) {
                    bnsl bnsl3 = (bnsl) f25392a.mo68388c();
                    bnsl3.mo68437a(e3);
                    bnsl3.mo68432a("kyd", "b", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Failed to load neural network from content resolver.");
                } catch (RuntimeException e4) {
                    bnsl bnsl4 = (bnsl) f25392a.mo68388c();
                    bnsl4.mo68437a(e4);
                    bnsl4.mo68432a("kyd", "b", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("Failed to instantiate neural network from content resolver.");
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            } else {
                neuralNetwork = NeuralNetwork.createFromFlatBuffer(this.f25396e);
            }
        }
        return kyn.m18798a(modelConfig, neuralNetwork);
        throw th;
        throw th;
    }

    /* renamed from: b */
    public final void mo14940b() {
        m18770c();
        m18771d();
    }
}
