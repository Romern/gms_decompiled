package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.aidlrequests.ApplyActionCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ChangeEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ChangePasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.CheckActionCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ConfirmPasswordResetAidlRequest;
import com.google.firebase.auth.api.aidlrequests.CreateUserWithEmailAndPasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.DeleteAidlRequest;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaEnrollmentAidlRequest;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaSignInAidlRequest;
import com.google.firebase.auth.api.aidlrequests.GetAccessTokenAidlRequest;
import com.google.firebase.auth.api.aidlrequests.GetProvidersForEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkEmailAuthCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkFederatedCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkPhoneAuthCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ReloadAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendEmailVerificationWithSettingsAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendGetOobConfirmationCodeEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendVerificationCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SetFirebaseUiVersionAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInAnonymouslyAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithCustomTokenAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailAndPasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailLinkAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithPhoneNumberAidlRequest;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberEnrollmentAidlRequest;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberSignInAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnenrollMfaAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnlinkEmailCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnlinkFederatedCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UpdateProfileAidlRequest;
import com.google.firebase.auth.api.aidlrequests.VerifyBeforeUpdateEmailAidlRequest;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: brpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class brpq extends dck implements brpr {
    public brpq() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        brpp brpp = null;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface instanceof brpp) {
                        brpp = (brpp) queryLocalInterface;
                    } else {
                        brpp = new brpp(readStrongBinder);
                    }
                }
                mo69724a(readString, brpp);
                break;
            case 2:
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    brpp = queryLocalInterface2 instanceof brpp ? (brpp) queryLocalInterface2 : new brpp(readStrongBinder2);
                }
                mo69731b(readString2, brpp);
                break;
            case 3:
                VerifyAssertionRequest verifyAssertionRequest = (VerifyAssertionRequest) dcl.m8163a(parcel, VerifyAssertionRequest.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface3 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface3;
                    } else {
                        brpp = new brpp(readStrongBinder3);
                    }
                }
                mo69723a(verifyAssertionRequest, brpp);
                break;
            case 4:
                String readString3 = parcel.readString();
                UserProfileChangeRequest userProfileChangeRequest = (UserProfileChangeRequest) dcl.m8163a(parcel, UserProfileChangeRequest.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface4 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface4;
                    } else {
                        brpp = new brpp(readStrongBinder4);
                    }
                }
                mo69727a(readString3, userProfileChangeRequest, brpp);
                break;
            case 5:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface5 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface5;
                    } else {
                        brpp = new brpp(readStrongBinder5);
                    }
                }
                mo69729a(readString4, readString5, brpp);
                break;
            case 6:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface6 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface6;
                    } else {
                        brpp = new brpp(readStrongBinder6);
                    }
                }
                mo69733b(readString6, readString7, brpp);
                break;
            case 7:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface7 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface7;
                    } else {
                        brpp = new brpp(readStrongBinder7);
                    }
                }
                mo69736c(readString8, readString9, brpp);
                break;
            case 8:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface8 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface8;
                    } else {
                        brpp = new brpp(readStrongBinder8);
                    }
                }
                mo69738d(readString10, readString11, brpp);
                break;
            case 9:
                String readString12 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface9 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface9;
                    } else {
                        brpp = new brpp(readStrongBinder9);
                    }
                }
                mo69734c(readString12, brpp);
                break;
            case 10:
                String readString13 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface10 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface10;
                    } else {
                        brpp = new brpp(readStrongBinder10);
                    }
                }
                mo69737d(readString13, brpp);
                break;
            case 11:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface11 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface11;
                    } else {
                        brpp = new brpp(readStrongBinder11);
                    }
                }
                mo69730a(readString14, readString15, readString16, brpp);
                break;
            case 12:
                String readString17 = parcel.readString();
                VerifyAssertionRequest verifyAssertionRequest2 = (VerifyAssertionRequest) dcl.m8163a(parcel, VerifyAssertionRequest.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface12 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface12;
                    } else {
                        brpp = new brpp(readStrongBinder12);
                    }
                }
                mo69728a(readString17, verifyAssertionRequest2, brpp);
                break;
            case 13:
                String readString18 = parcel.readString();
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface13 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface13;
                    } else {
                        brpp = new brpp(readStrongBinder13);
                    }
                }
                mo69743g(readString18, brpp);
                break;
            case 14:
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface14 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface14;
                    } else {
                        brpp = new brpp(readStrongBinder14);
                    }
                }
                mo69742f(readString19, readString20, brpp);
                break;
            case 15:
                String readString21 = parcel.readString();
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface15 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface15;
                    } else {
                        brpp = new brpp(readStrongBinder15);
                    }
                }
                mo69744h(readString21, brpp);
                break;
            case 16:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface16 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface16;
                    } else {
                        brpp = new brpp(readStrongBinder16);
                    }
                }
                mo69687a(brpp);
                break;
            case 17:
                String readString22 = parcel.readString();
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface17 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface17;
                    } else {
                        brpp = new brpp(readStrongBinder17);
                    }
                }
                mo69745i(readString22, brpp);
                break;
            case 18:
                String readString23 = parcel.readString();
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface18 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface18;
                    } else {
                        brpp = new brpp(readStrongBinder18);
                    }
                }
                mo69746j(readString23, brpp);
                break;
            case 19:
                String readString24 = parcel.readString();
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface19 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface19;
                    } else {
                        brpp = new brpp(readStrongBinder19);
                    }
                }
                mo69739e(readString24, brpp);
                break;
            case 20:
                String readString25 = parcel.readString();
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface20 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface20;
                    } else {
                        brpp = new brpp(readStrongBinder20);
                    }
                }
                mo69741f(readString25, brpp);
                break;
            case 21:
                String readString26 = parcel.readString();
                String readString27 = parcel.readString();
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface21 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface21;
                    } else {
                        brpp = new brpp(readStrongBinder21);
                    }
                }
                mo69740e(readString26, readString27, brpp);
                break;
            case 22:
                SendVerificationCodeRequest sendVerificationCodeRequest = (SendVerificationCodeRequest) dcl.m8163a(parcel, SendVerificationCodeRequest.CREATOR);
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface22 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface22;
                    } else {
                        brpp = new brpp(readStrongBinder22);
                    }
                }
                mo69722a(sendVerificationCodeRequest, brpp);
                break;
            case 23:
                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) dcl.m8163a(parcel, PhoneAuthCredential.CREATOR);
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface23 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface23;
                    } else {
                        brpp = new brpp(readStrongBinder23);
                    }
                }
                mo69689a(phoneAuthCredential, brpp);
                break;
            case 24:
                String readString28 = parcel.readString();
                PhoneAuthCredential phoneAuthCredential2 = (PhoneAuthCredential) dcl.m8163a(parcel, PhoneAuthCredential.CREATOR);
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface24 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface24;
                    } else {
                        brpp = new brpp(readStrongBinder24);
                    }
                }
                mo69726a(readString28, phoneAuthCredential2, brpp);
                break;
            case 25:
                String readString29 = parcel.readString();
                ActionCodeSettings actionCodeSettings = (ActionCodeSettings) dcl.m8163a(parcel, ActionCodeSettings.CREATOR);
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface25 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface25;
                    } else {
                        brpp = new brpp(readStrongBinder25);
                    }
                }
                mo69725a(readString29, actionCodeSettings, brpp);
                break;
            case 26:
                String readString30 = parcel.readString();
                ActionCodeSettings actionCodeSettings2 = (ActionCodeSettings) dcl.m8163a(parcel, ActionCodeSettings.CREATOR);
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 != null) {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface26 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface26;
                    } else {
                        brpp = new brpp(readStrongBinder26);
                    }
                }
                mo69732b(readString30, actionCodeSettings2, brpp);
                break;
            case 27:
                String readString31 = parcel.readString();
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface27 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface27;
                    } else {
                        brpp = new brpp(readStrongBinder27);
                    }
                }
                mo69747k(readString31, brpp);
                break;
            case 28:
                String readString32 = parcel.readString();
                ActionCodeSettings actionCodeSettings3 = (ActionCodeSettings) dcl.m8163a(parcel, ActionCodeSettings.CREATOR);
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface28 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface28;
                    } else {
                        brpp = new brpp(readStrongBinder28);
                    }
                }
                mo69735c(readString32, actionCodeSettings3, brpp);
                break;
            case 29:
                EmailAuthCredential emailAuthCredential = (EmailAuthCredential) dcl.m8163a(parcel, EmailAuthCredential.CREATOR);
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface29 instanceof brpp) {
                        brpp = (brpp) queryLocalInterface29;
                    } else {
                        brpp = new brpp(readStrongBinder29);
                    }
                }
                mo69688a(emailAuthCredential, brpp);
                break;
            default:
                switch (i) {
                    case 101:
                        GetAccessTokenAidlRequest getAccessTokenAidlRequest = (GetAccessTokenAidlRequest) dcl.m8163a(parcel, GetAccessTokenAidlRequest.CREATOR);
                        IBinder readStrongBinder30 = parcel.readStrongBinder();
                        if (readStrongBinder30 != null) {
                            IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                            if (queryLocalInterface30 instanceof brpp) {
                                brpp = (brpp) queryLocalInterface30;
                            } else {
                                brpp = new brpp(readStrongBinder30);
                            }
                        }
                        mo69699a(getAccessTokenAidlRequest, brpp);
                        break;
                    case 102:
                        SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest = (SignInWithCustomTokenAidlRequest) dcl.m8163a(parcel, SignInWithCustomTokenAidlRequest.CREATOR);
                        IBinder readStrongBinder31 = parcel.readStrongBinder();
                        if (readStrongBinder31 != null) {
                            IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                            if (queryLocalInterface31 instanceof brpp) {
                                brpp = (brpp) queryLocalInterface31;
                            } else {
                                brpp = new brpp(readStrongBinder31);
                            }
                        }
                        mo69711a(signInWithCustomTokenAidlRequest, brpp);
                        break;
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        SignInWithCredentialAidlRequest signInWithCredentialAidlRequest = (SignInWithCredentialAidlRequest) dcl.m8163a(parcel, SignInWithCredentialAidlRequest.CREATOR);
                        IBinder readStrongBinder32 = parcel.readStrongBinder();
                        if (readStrongBinder32 != null) {
                            IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                            if (queryLocalInterface32 instanceof brpp) {
                                brpp = (brpp) queryLocalInterface32;
                            } else {
                                brpp = new brpp(readStrongBinder32);
                            }
                        }
                        mo69710a(signInWithCredentialAidlRequest, brpp);
                        break;
                    case ErrorInfo.TYPE_SDU_FAILED:
                        UpdateProfileAidlRequest updateProfileAidlRequest = (UpdateProfileAidlRequest) dcl.m8163a(parcel, UpdateProfileAidlRequest.CREATOR);
                        IBinder readStrongBinder33 = parcel.readStrongBinder();
                        if (readStrongBinder33 != null) {
                            IInterface queryLocalInterface33 = readStrongBinder33.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                            if (queryLocalInterface33 instanceof brpp) {
                                brpp = (brpp) queryLocalInterface33;
                            } else {
                                brpp = new brpp(readStrongBinder33);
                            }
                        }
                        mo69720a(updateProfileAidlRequest, brpp);
                        break;
                    case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                        ChangeEmailAidlRequest changeEmailAidlRequest = (ChangeEmailAidlRequest) dcl.m8163a(parcel, ChangeEmailAidlRequest.CREATOR);
                        IBinder readStrongBinder34 = parcel.readStrongBinder();
                        if (readStrongBinder34 != null) {
                            IInterface queryLocalInterface34 = readStrongBinder34.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                            if (queryLocalInterface34 instanceof brpp) {
                                brpp = (brpp) queryLocalInterface34;
                            } else {
                                brpp = new brpp(readStrongBinder34);
                            }
                        }
                        mo69691a(changeEmailAidlRequest, brpp);
                        break;
                    case 106:
                        ChangePasswordAidlRequest changePasswordAidlRequest = (ChangePasswordAidlRequest) dcl.m8163a(parcel, ChangePasswordAidlRequest.CREATOR);
                        IBinder readStrongBinder35 = parcel.readStrongBinder();
                        if (readStrongBinder35 != null) {
                            IInterface queryLocalInterface35 = readStrongBinder35.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                            if (queryLocalInterface35 instanceof brpp) {
                                brpp = (brpp) queryLocalInterface35;
                            } else {
                                brpp = new brpp(readStrongBinder35);
                            }
                        }
                        mo69692a(changePasswordAidlRequest, brpp);
                        break;
                    case 107:
                        CreateUserWithEmailAndPasswordAidlRequest createUserWithEmailAndPasswordAidlRequest = (CreateUserWithEmailAndPasswordAidlRequest) dcl.m8163a(parcel, CreateUserWithEmailAndPasswordAidlRequest.CREATOR);
                        IBinder readStrongBinder36 = parcel.readStrongBinder();
                        if (readStrongBinder36 != null) {
                            IInterface queryLocalInterface36 = readStrongBinder36.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                            if (queryLocalInterface36 instanceof brpp) {
                                brpp = (brpp) queryLocalInterface36;
                            } else {
                                brpp = new brpp(readStrongBinder36);
                            }
                        }
                        mo69695a(createUserWithEmailAndPasswordAidlRequest, brpp);
                        break;
                    case 108:
                        SignInWithEmailAndPasswordAidlRequest signInWithEmailAndPasswordAidlRequest = (SignInWithEmailAndPasswordAidlRequest) dcl.m8163a(parcel, SignInWithEmailAndPasswordAidlRequest.CREATOR);
                        IBinder readStrongBinder37 = parcel.readStrongBinder();
                        if (readStrongBinder37 != null) {
                            IInterface queryLocalInterface37 = readStrongBinder37.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                            if (queryLocalInterface37 instanceof brpp) {
                                brpp = (brpp) queryLocalInterface37;
                            } else {
                                brpp = new brpp(readStrongBinder37);
                            }
                        }
                        mo69712a(signInWithEmailAndPasswordAidlRequest, brpp);
                        break;
                    case 109:
                        GetProvidersForEmailAidlRequest getProvidersForEmailAidlRequest = (GetProvidersForEmailAidlRequest) dcl.m8163a(parcel, GetProvidersForEmailAidlRequest.CREATOR);
                        IBinder readStrongBinder38 = parcel.readStrongBinder();
                        if (readStrongBinder38 != null) {
                            IInterface queryLocalInterface38 = readStrongBinder38.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                            if (queryLocalInterface38 instanceof brpp) {
                                brpp = (brpp) queryLocalInterface38;
                            } else {
                                brpp = new brpp(readStrongBinder38);
                            }
                        }
                        mo69700a(getProvidersForEmailAidlRequest, brpp);
                        break;
                    default:
                        switch (i) {
                            case 111:
                                LinkEmailAuthCredentialAidlRequest linkEmailAuthCredentialAidlRequest = (LinkEmailAuthCredentialAidlRequest) dcl.m8163a(parcel, LinkEmailAuthCredentialAidlRequest.CREATOR);
                                IBinder readStrongBinder39 = parcel.readStrongBinder();
                                if (readStrongBinder39 != null) {
                                    IInterface queryLocalInterface39 = readStrongBinder39.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                    if (queryLocalInterface39 instanceof brpp) {
                                        brpp = (brpp) queryLocalInterface39;
                                    } else {
                                        brpp = new brpp(readStrongBinder39);
                                    }
                                }
                                mo69701a(linkEmailAuthCredentialAidlRequest, brpp);
                                break;
                            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                                LinkFederatedCredentialAidlRequest linkFederatedCredentialAidlRequest = (LinkFederatedCredentialAidlRequest) dcl.m8163a(parcel, LinkFederatedCredentialAidlRequest.CREATOR);
                                IBinder readStrongBinder40 = parcel.readStrongBinder();
                                if (readStrongBinder40 != null) {
                                    IInterface queryLocalInterface40 = readStrongBinder40.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                    if (queryLocalInterface40 instanceof brpp) {
                                        brpp = (brpp) queryLocalInterface40;
                                    } else {
                                        brpp = new brpp(readStrongBinder40);
                                    }
                                }
                                mo69702a(linkFederatedCredentialAidlRequest, brpp);
                                break;
                            case 113:
                                UnlinkEmailCredentialAidlRequest unlinkEmailCredentialAidlRequest = (UnlinkEmailCredentialAidlRequest) dcl.m8163a(parcel, UnlinkEmailCredentialAidlRequest.CREATOR);
                                IBinder readStrongBinder41 = parcel.readStrongBinder();
                                if (readStrongBinder41 != null) {
                                    IInterface queryLocalInterface41 = readStrongBinder41.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                    if (queryLocalInterface41 instanceof brpp) {
                                        brpp = (brpp) queryLocalInterface41;
                                    } else {
                                        brpp = new brpp(readStrongBinder41);
                                    }
                                }
                                mo69718a(unlinkEmailCredentialAidlRequest, brpp);
                                break;
                            case 114:
                                UnlinkFederatedCredentialAidlRequest unlinkFederatedCredentialAidlRequest = (UnlinkFederatedCredentialAidlRequest) dcl.m8163a(parcel, UnlinkFederatedCredentialAidlRequest.CREATOR);
                                IBinder readStrongBinder42 = parcel.readStrongBinder();
                                if (readStrongBinder42 != null) {
                                    IInterface queryLocalInterface42 = readStrongBinder42.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                    if (queryLocalInterface42 instanceof brpp) {
                                        brpp = (brpp) queryLocalInterface42;
                                    } else {
                                        brpp = new brpp(readStrongBinder42);
                                    }
                                }
                                mo69719a(unlinkFederatedCredentialAidlRequest, brpp);
                                break;
                            case 115:
                                ReloadAidlRequest reloadAidlRequest = (ReloadAidlRequest) dcl.m8163a(parcel, ReloadAidlRequest.CREATOR);
                                IBinder readStrongBinder43 = parcel.readStrongBinder();
                                if (readStrongBinder43 != null) {
                                    IInterface queryLocalInterface43 = readStrongBinder43.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                    if (queryLocalInterface43 instanceof brpp) {
                                        brpp = (brpp) queryLocalInterface43;
                                    } else {
                                        brpp = new brpp(readStrongBinder43);
                                    }
                                }
                                mo69704a(reloadAidlRequest, brpp);
                                break;
                            case 116:
                                SignInAnonymouslyAidlRequest signInAnonymouslyAidlRequest = (SignInAnonymouslyAidlRequest) dcl.m8163a(parcel, SignInAnonymouslyAidlRequest.CREATOR);
                                IBinder readStrongBinder44 = parcel.readStrongBinder();
                                if (readStrongBinder44 != null) {
                                    IInterface queryLocalInterface44 = readStrongBinder44.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                    if (queryLocalInterface44 instanceof brpp) {
                                        brpp = (brpp) queryLocalInterface44;
                                    } else {
                                        brpp = new brpp(readStrongBinder44);
                                    }
                                }
                                mo69709a(signInAnonymouslyAidlRequest, brpp);
                                break;
                            case 117:
                                DeleteAidlRequest deleteAidlRequest = (DeleteAidlRequest) dcl.m8163a(parcel, DeleteAidlRequest.CREATOR);
                                IBinder readStrongBinder45 = parcel.readStrongBinder();
                                if (readStrongBinder45 != null) {
                                    IInterface queryLocalInterface45 = readStrongBinder45.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                    if (queryLocalInterface45 instanceof brpp) {
                                        brpp = (brpp) queryLocalInterface45;
                                    } else {
                                        brpp = new brpp(readStrongBinder45);
                                    }
                                }
                                mo69696a(deleteAidlRequest, brpp);
                                break;
                            default:
                                switch (i) {
                                    case 119:
                                        CheckActionCodeAidlRequest checkActionCodeAidlRequest = (CheckActionCodeAidlRequest) dcl.m8163a(parcel, CheckActionCodeAidlRequest.CREATOR);
                                        IBinder readStrongBinder46 = parcel.readStrongBinder();
                                        if (readStrongBinder46 != null) {
                                            IInterface queryLocalInterface46 = readStrongBinder46.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                            if (queryLocalInterface46 instanceof brpp) {
                                                brpp = (brpp) queryLocalInterface46;
                                            } else {
                                                brpp = new brpp(readStrongBinder46);
                                            }
                                        }
                                        mo69693a(checkActionCodeAidlRequest, brpp);
                                        break;
                                    case 120:
                                        ApplyActionCodeAidlRequest applyActionCodeAidlRequest = (ApplyActionCodeAidlRequest) dcl.m8163a(parcel, ApplyActionCodeAidlRequest.CREATOR);
                                        IBinder readStrongBinder47 = parcel.readStrongBinder();
                                        if (readStrongBinder47 != null) {
                                            IInterface queryLocalInterface47 = readStrongBinder47.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                            if (queryLocalInterface47 instanceof brpp) {
                                                brpp = (brpp) queryLocalInterface47;
                                            } else {
                                                brpp = new brpp(readStrongBinder47);
                                            }
                                        }
                                        mo69690a(applyActionCodeAidlRequest, brpp);
                                        break;
                                    case 121:
                                        ConfirmPasswordResetAidlRequest confirmPasswordResetAidlRequest = (ConfirmPasswordResetAidlRequest) dcl.m8163a(parcel, ConfirmPasswordResetAidlRequest.CREATOR);
                                        IBinder readStrongBinder48 = parcel.readStrongBinder();
                                        if (readStrongBinder48 != null) {
                                            IInterface queryLocalInterface48 = readStrongBinder48.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                            if (queryLocalInterface48 instanceof brpp) {
                                                brpp = (brpp) queryLocalInterface48;
                                            } else {
                                                brpp = new brpp(readStrongBinder48);
                                            }
                                        }
                                        mo69694a(confirmPasswordResetAidlRequest, brpp);
                                        break;
                                    case 122:
                                        SendVerificationCodeAidlRequest sendVerificationCodeAidlRequest = (SendVerificationCodeAidlRequest) dcl.m8163a(parcel, SendVerificationCodeAidlRequest.CREATOR);
                                        IBinder readStrongBinder49 = parcel.readStrongBinder();
                                        if (readStrongBinder49 != null) {
                                            IInterface queryLocalInterface49 = readStrongBinder49.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                            if (queryLocalInterface49 instanceof brpp) {
                                                brpp = (brpp) queryLocalInterface49;
                                            } else {
                                                brpp = new brpp(readStrongBinder49);
                                            }
                                        }
                                        mo69707a(sendVerificationCodeAidlRequest, brpp);
                                        break;
                                    case 123:
                                        SignInWithPhoneNumberAidlRequest signInWithPhoneNumberAidlRequest = (SignInWithPhoneNumberAidlRequest) dcl.m8163a(parcel, SignInWithPhoneNumberAidlRequest.CREATOR);
                                        IBinder readStrongBinder50 = parcel.readStrongBinder();
                                        if (readStrongBinder50 != null) {
                                            IInterface queryLocalInterface50 = readStrongBinder50.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                            if (queryLocalInterface50 instanceof brpp) {
                                                brpp = (brpp) queryLocalInterface50;
                                            } else {
                                                brpp = new brpp(readStrongBinder50);
                                            }
                                        }
                                        mo69714a(signInWithPhoneNumberAidlRequest, brpp);
                                        break;
                                    case 124:
                                        LinkPhoneAuthCredentialAidlRequest linkPhoneAuthCredentialAidlRequest = (LinkPhoneAuthCredentialAidlRequest) dcl.m8163a(parcel, LinkPhoneAuthCredentialAidlRequest.CREATOR);
                                        IBinder readStrongBinder51 = parcel.readStrongBinder();
                                        if (readStrongBinder51 != null) {
                                            IInterface queryLocalInterface51 = readStrongBinder51.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                            if (queryLocalInterface51 instanceof brpp) {
                                                brpp = (brpp) queryLocalInterface51;
                                            } else {
                                                brpp = new brpp(readStrongBinder51);
                                            }
                                        }
                                        mo69703a(linkPhoneAuthCredentialAidlRequest, brpp);
                                        break;
                                    default:
                                        switch (i) {
                                            case 126:
                                                SendEmailVerificationWithSettingsAidlRequest sendEmailVerificationWithSettingsAidlRequest = (SendEmailVerificationWithSettingsAidlRequest) dcl.m8163a(parcel, SendEmailVerificationWithSettingsAidlRequest.CREATOR);
                                                IBinder readStrongBinder52 = parcel.readStrongBinder();
                                                if (readStrongBinder52 != null) {
                                                    IInterface queryLocalInterface52 = readStrongBinder52.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                                    if (queryLocalInterface52 instanceof brpp) {
                                                        brpp = (brpp) queryLocalInterface52;
                                                    } else {
                                                        brpp = new brpp(readStrongBinder52);
                                                    }
                                                }
                                                mo69705a(sendEmailVerificationWithSettingsAidlRequest, brpp);
                                                break;
                                            case 127:
                                                SetFirebaseUiVersionAidlRequest setFirebaseUiVersionAidlRequest = (SetFirebaseUiVersionAidlRequest) dcl.m8163a(parcel, SetFirebaseUiVersionAidlRequest.CREATOR);
                                                IBinder readStrongBinder53 = parcel.readStrongBinder();
                                                if (readStrongBinder53 != null) {
                                                    IInterface queryLocalInterface53 = readStrongBinder53.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                                    if (queryLocalInterface53 instanceof brpp) {
                                                        brpp = (brpp) queryLocalInterface53;
                                                    } else {
                                                        brpp = new brpp(readStrongBinder53);
                                                    }
                                                }
                                                mo69708a(setFirebaseUiVersionAidlRequest, brpp);
                                                break;
                                            case 128:
                                                SendGetOobConfirmationCodeEmailAidlRequest sendGetOobConfirmationCodeEmailAidlRequest = (SendGetOobConfirmationCodeEmailAidlRequest) dcl.m8163a(parcel, SendGetOobConfirmationCodeEmailAidlRequest.CREATOR);
                                                IBinder readStrongBinder54 = parcel.readStrongBinder();
                                                if (readStrongBinder54 != null) {
                                                    IInterface queryLocalInterface54 = readStrongBinder54.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                                    if (queryLocalInterface54 instanceof brpp) {
                                                        brpp = (brpp) queryLocalInterface54;
                                                    } else {
                                                        brpp = new brpp(readStrongBinder54);
                                                    }
                                                }
                                                mo69706a(sendGetOobConfirmationCodeEmailAidlRequest, brpp);
                                                break;
                                            case 129:
                                                SignInWithEmailLinkAidlRequest signInWithEmailLinkAidlRequest = (SignInWithEmailLinkAidlRequest) dcl.m8163a(parcel, SignInWithEmailLinkAidlRequest.CREATOR);
                                                IBinder readStrongBinder55 = parcel.readStrongBinder();
                                                if (readStrongBinder55 != null) {
                                                    IInterface queryLocalInterface55 = readStrongBinder55.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                                    if (queryLocalInterface55 instanceof brpp) {
                                                        brpp = (brpp) queryLocalInterface55;
                                                    } else {
                                                        brpp = new brpp(readStrongBinder55);
                                                    }
                                                }
                                                mo69713a(signInWithEmailLinkAidlRequest, brpp);
                                                break;
                                            case 130:
                                                StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest = (StartMfaPhoneNumberEnrollmentAidlRequest) dcl.m8163a(parcel, StartMfaPhoneNumberEnrollmentAidlRequest.CREATOR);
                                                IBinder readStrongBinder56 = parcel.readStrongBinder();
                                                if (readStrongBinder56 != null) {
                                                    IInterface queryLocalInterface56 = readStrongBinder56.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                                    if (queryLocalInterface56 instanceof brpp) {
                                                        brpp = (brpp) queryLocalInterface56;
                                                    } else {
                                                        brpp = new brpp(readStrongBinder56);
                                                    }
                                                }
                                                mo69715a(startMfaPhoneNumberEnrollmentAidlRequest, brpp);
                                                break;
                                            case 131:
                                                UnenrollMfaAidlRequest unenrollMfaAidlRequest = (UnenrollMfaAidlRequest) dcl.m8163a(parcel, UnenrollMfaAidlRequest.CREATOR);
                                                IBinder readStrongBinder57 = parcel.readStrongBinder();
                                                if (readStrongBinder57 != null) {
                                                    IInterface queryLocalInterface57 = readStrongBinder57.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                                    if (queryLocalInterface57 instanceof brpp) {
                                                        brpp = (brpp) queryLocalInterface57;
                                                    } else {
                                                        brpp = new brpp(readStrongBinder57);
                                                    }
                                                }
                                                mo69717a(unenrollMfaAidlRequest, brpp);
                                                break;
                                            case 132:
                                                FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest = (FinalizeMfaEnrollmentAidlRequest) dcl.m8163a(parcel, FinalizeMfaEnrollmentAidlRequest.CREATOR);
                                                IBinder readStrongBinder58 = parcel.readStrongBinder();
                                                if (readStrongBinder58 != null) {
                                                    IInterface queryLocalInterface58 = readStrongBinder58.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                                    if (queryLocalInterface58 instanceof brpp) {
                                                        brpp = (brpp) queryLocalInterface58;
                                                    } else {
                                                        brpp = new brpp(readStrongBinder58);
                                                    }
                                                }
                                                mo69697a(finalizeMfaEnrollmentAidlRequest, brpp);
                                                break;
                                            case 133:
                                                StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest = (StartMfaPhoneNumberSignInAidlRequest) dcl.m8163a(parcel, StartMfaPhoneNumberSignInAidlRequest.CREATOR);
                                                IBinder readStrongBinder59 = parcel.readStrongBinder();
                                                if (readStrongBinder59 != null) {
                                                    IInterface queryLocalInterface59 = readStrongBinder59.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                                    if (queryLocalInterface59 instanceof brpp) {
                                                        brpp = (brpp) queryLocalInterface59;
                                                    } else {
                                                        brpp = new brpp(readStrongBinder59);
                                                    }
                                                }
                                                mo69716a(startMfaPhoneNumberSignInAidlRequest, brpp);
                                                break;
                                            case 134:
                                                FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest = (FinalizeMfaSignInAidlRequest) dcl.m8163a(parcel, FinalizeMfaSignInAidlRequest.CREATOR);
                                                IBinder readStrongBinder60 = parcel.readStrongBinder();
                                                if (readStrongBinder60 != null) {
                                                    IInterface queryLocalInterface60 = readStrongBinder60.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                                    if (queryLocalInterface60 instanceof brpp) {
                                                        brpp = (brpp) queryLocalInterface60;
                                                    } else {
                                                        brpp = new brpp(readStrongBinder60);
                                                    }
                                                }
                                                mo69698a(finalizeMfaSignInAidlRequest, brpp);
                                                break;
                                            case 135:
                                                VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest = (VerifyBeforeUpdateEmailAidlRequest) dcl.m8163a(parcel, VerifyBeforeUpdateEmailAidlRequest.CREATOR);
                                                IBinder readStrongBinder61 = parcel.readStrongBinder();
                                                if (readStrongBinder61 != null) {
                                                    IInterface queryLocalInterface61 = readStrongBinder61.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                                                    if (queryLocalInterface61 instanceof brpp) {
                                                        brpp = (brpp) queryLocalInterface61;
                                                    } else {
                                                        brpp = new brpp(readStrongBinder61);
                                                    }
                                                }
                                                mo69721a(verifyBeforeUpdateEmailAidlRequest, brpp);
                                                break;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
        parcel2.writeNoException();
        return true;
    }
}
