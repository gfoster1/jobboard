<template>
  <div class="form-group">
    <form v-on:submit.prevent="onSubmit">
      <label for="title">Title</label>
      <input
        type="text"
        id="title"
        class="form-control"
        v-model="userData.title"
      />
      <label for="salary">Salary</label>
      <input
        type="text"
        id="salary"
        class="form-control"
        v-model="userData.salary"
      />
      <label for="type">type</label>
      <input
        type="text"
        id="type"
        class="form-control"
        v-model="userData.type"
      />
      <label for="location">Location</label>
      <input
        type="text"
        id="location"
        class="form-control"
        v-model="userData.location"
      />
      <label for="description">Description</label>
      <textarea
        id="description"
        rows="5"
        class="form-control"
        v-model="userData.description"
      ></textarea>
      <button type="submit">Submit</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    msg: String,
  },
  data() {
    return {
      userData: {
        title: "",
        salary: "",
        type: "",
        description: "",
        location: "",
      },
    };
  },
  methods: {
    onSubmit() {
      console.log("submitted", this.userData);
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
