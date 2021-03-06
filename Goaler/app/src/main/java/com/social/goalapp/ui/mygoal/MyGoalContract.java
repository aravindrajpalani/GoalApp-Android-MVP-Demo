/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.social.goalapp.ui.mygoal;

import com.social.goalapp.data.network.model.Result;
import com.social.goalapp.ui.base.BasePresenter;
import com.social.goalapp.ui.base.BaseView;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface MyGoalContract {

    interface View extends BaseView<Presenter> {

        void addMyGoalData(Result list);
        void showAddGoalUI();






    }

    interface Presenter extends BasePresenter {

        void callMyGoalAPI();

        void calladdCommentAPI(int bloid,String comment);

        void callDeleteGoalAPI(int bloid);

        void callAddGoalAPI(int goaldays,String content);

        void callUpdateGoalAPI(int bloid,String status);




    }
}
